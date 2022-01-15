package com.example.routes

import com.example.apiResponse.PokemonDetailResponse
import com.example.repository.PokemonRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getPokemonById() {

    val pokemonRepository: PokemonRepository by inject()

    get("/pokemons/detail") {
        try {
            val pokemonId = call.request.queryParameters["id"]?.toInt() ?: 1

            val pokemon = pokemonRepository.getPokemonById(pokemonId)
            call.respond(
                message = pokemon,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = PokemonDetailResponse(success = false, message = "Only Integers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = PokemonDetailResponse(success = false, message = "Pokemon not Found."),
                status = HttpStatusCode.NotFound
            )
        } catch (e: ArithmeticException) {
            call.respond(
                message = PokemonDetailResponse(success = false, message = "Page size can't be zero."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: Exception) {
            call.respond(
                message = PokemonDetailResponse(success = false, message = e.message),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}