package com.example.apiResponse

import com.example.models.PokemonDetail
import kotlinx.serialization.Serializable

@Serializable
data class PokemonDetailResponse(
    val success: Boolean,
    val message: String? = null,
    val pokemon: PokemonDetail?=null
)
