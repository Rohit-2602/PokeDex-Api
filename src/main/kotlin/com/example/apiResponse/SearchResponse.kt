package com.example.apiResponse

import com.example.Pokemons
import com.example.models.Pokemon
import com.example.models.PokemonDetail
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse(
    val success: Boolean,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val pokemons: List<Pokemon> = emptyList()
)
