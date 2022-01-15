package com.example.plugins

import com.example.routes.getAllPokemons
import com.example.routes.getPokemonById
import com.example.routes.root
import com.example.routes.searchPokemons
import io.ktor.application.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllPokemons()
        searchPokemons()
        getPokemonById()
    }
}
