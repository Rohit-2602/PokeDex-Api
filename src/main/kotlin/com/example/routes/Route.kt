package com.example.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to Pokedex Api. \n\n" +
                    "Here are All the EndPoints -\n\n" +
                    "Here are All EndPoints -\n\n" +
                    "/pokemons         -> List all the pokemons\n\n" +
                    "queries accepted  -- \n" +
                    "page (Integer)    -> Page number you want to get, with default value of 1.\n" +
                    "pageSize (Integer)-> Number of pokemons you want per page, with default value of 10.\n\n" +
                    "Example           -> https://poki-dex.herokuapp.com/pokemons?page=2&pageSize=30\n\n" +
                    "/pokemons/detail  -> Get details of a particular pokemon.\n\n" +
                    "queries accepted  -- \n" +
                    "id (Integer)      -> PokemonId you need to get details of.\n\n" +
                    "Example           -> https://poki-dex.herokuapp.com/pokemons/detail?id=20\n\n" +
                    "/pokemons/search  -> Search Pokemon by their name (only).\n\n" +
                    "queries accepted  -- \n" +
                    "name (String)     -> List all the pokemon with names starting with query.\n" +
                    "page (Integer)    -> Page number you want to get, with default value of 1.\n" +
                    "pageSize (Integer)-> Number of pokemons you want per page, with default value of 20.\n\n" +
                    "Example           -> https://poki-dex.herokuapp.com/pokemons/search?name=pika&page=1&pageSize=20",
            status = HttpStatusCode.OK
        )
    }
}