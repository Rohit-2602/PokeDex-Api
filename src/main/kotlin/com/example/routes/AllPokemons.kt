package com.example.routes

import com.example.Pokemons
import com.example.apiResponse.AllPokemonResponse
import com.example.repository.PokemonRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException

fun Route.getAllPokemons() {

    val pokemonRepository: PokemonRepository by inject()

    get("/pokemons") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val pageSize = call.request.queryParameters["pageSize"]?.toInt() ?: 10

            val totalPages =
                if (Pokemons.POKEMON_LIST.size % pageSize == 0) {
                    Pokemons.POKEMON_LIST.size / pageSize
                } else {
                    (Pokemons.POKEMON_LIST.size / pageSize) + 1
                }

            val allPokemons =
                pokemonRepository.getAllPokemons(page = page, pageSize = pageSize, totalPages = totalPages)
            call.respond(
                message = allPokemons,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = AllPokemonResponse(success = false, message = "Only Integers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = AllPokemonResponse(success = false, message = "Pokemon not Found."),
                status = HttpStatusCode.NotFound
            )
        } catch (e: ArithmeticException) {
            call.respond(
                message = AllPokemonResponse(success = false, message = "Page size can't be zero."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: Exception) {
            call.respond(
                message = AllPokemonResponse(success = false, message = e.message),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}