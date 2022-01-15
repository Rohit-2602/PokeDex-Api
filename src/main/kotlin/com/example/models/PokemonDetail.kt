package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class PokemonDetail(
    val id: Int,
    val name: String,
    val imageUrl: String = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$id.png",
    val weight: Int,
    val height: Int,
    val abilities: List<Ability>,
    val stats: List<Stat>,
    val types: List<Type>
)

@Serializable
data class Ability(
    val name: String
)

@Serializable
data class Stat(
    val name: String,
    val base_stat: Int
)

@Serializable
data class Type(
    val name: String
)
