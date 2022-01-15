package com.example.repository

import com.example.apiResponse.AllPokemonResponse
import com.example.apiResponse.PokemonDetailResponse
import com.example.apiResponse.SearchResponse
import com.example.models.Pokemon

interface PokemonRepository {
    val allPokemons: List<Pokemon>

    suspend fun getAllPokemons(page: Int = 1, pageSize: Int = 10, totalPages: Int): AllPokemonResponse
    suspend fun searchPokemons(name: String, page: Int = 1, pageSize: Int = 10): SearchResponse
    suspend fun getPokemonById(id: Int): PokemonDetailResponse

}