package com.example.apiResponse

import com.example.Pokemons
import com.example.models.Pokemon
import kotlinx.serialization.Serializable

@Serializable
data class AllPokemonResponse(
    val success: Boolean,
    val total: Int = Pokemons.POKEMON_LIST.size,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val pokemons: List<Pokemon> = emptyList()
)
