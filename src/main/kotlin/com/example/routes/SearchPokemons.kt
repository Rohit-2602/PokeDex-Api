package com.example.routes

import com.example.apiResponse.AllPokemonResponse
import com.example.repository.PokemonRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException

fun Route.searchPokemons() {

    val pokemonRepository: PokemonRepository by inject()

    get("/pokemons/search") {
        try {
            val name = call.request.queryParameters["name"] ?: ""
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val pageSize = call.request.queryParameters["pageSize"]?.toInt() ?: 20

            val searchedPokemons = pokemonRepository.searchPokemons(name = name, page = page, pageSize = pageSize)
            call.respond(
                message = searchedPokemons,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = AllPokemonResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = AllPokemonResponse(success = false, message = "Pokemon not Found."),
                status = HttpStatusCode.NotFound
            )
        } catch (e: Exception) {
            call.respond(
                message = AllPokemonResponse(success = false, message = e.message),
                status = HttpStatusCode.NotFound
            )
        }
    }
}