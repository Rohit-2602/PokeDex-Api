package com.example.repository

import com.example.*
import com.example.PokemonDetail
import com.example.apiResponse.AllPokemonResponse
import com.example.apiResponse.PokemonDetailResponse
import com.example.apiResponse.SearchResponse
import com.example.models.*

class PokemonRepositoryImpl : PokemonRepository {

    override val allPokemons: List<Pokemon> = Pokemons.POKEMON_LIST

    override suspend fun getAllPokemons(page: Int, pageSize: Int, totalPages: Int): AllPokemonResponse {
        if (page == 0) {
            return AllPokemonResponse(
                success = false,
                message = "Page starts from index 1",
                previousPage = null,
                nextPage = 1,
                pokemons = emptyList()
            )
        }
        val start = pageSize * (page - 1)
        val end = start + (pageSize - 1)

        val result = mutableListOf<Pokemon>()

        if (end > allPokemons.size) {
            for (i in start until allPokemons.size) {
                result.add(allPokemons[i])
            }
        } else {
            for (i in start..end) {
                result.add(allPokemons[i])
            }
        }
        return AllPokemonResponse(
            success = true,
            message = "Ok",
            previousPage = calculatePage(page, totalPages)["prev_page"],
            nextPage = calculatePage(page, totalPages)["next_page"],
            pokemons = result
        )
    }

    override suspend fun searchPokemons(name: String, page: Int, pageSize: Int): SearchResponse {
        if (page == 0) {
            return SearchResponse(
                success = false,
                message = "Page starts from index 1",
                previousPage = null,
                nextPage = 1,
                pokemons = emptyList()
            )
        }

        val result = allPokemons.filter { pokemon ->
            pokemon.name.lowercase().startsWith(name.lowercase())
        }

        val start = pageSize * (page - 1)
        val end = start + (pageSize - 1)
        val totalPages =
            if (result.size % pageSize == 0) {
                result.size / pageSize
            } else {
                (result.size / pageSize) + 1
            }

        val pokemon = mutableListOf<Pokemon>()

        if (end > result.size) {
            for (i in start until result.size) {
                pokemon.add(result[i])
            }
        } else {
            for (i in start..end) {
                pokemon.add(result[i])
            }
        }
        return if (result.isEmpty()) {
            return SearchResponse(
                success = true,
                message = "No result found for $name",
                previousPage = null,
                nextPage = null,
                pokemons = emptyList()
            )
        } else {
            SearchResponse(
                success = true,
                message = "Ok",
                previousPage = calculatePage(page, totalPages)["prev_page"],
                nextPage = calculatePage(page, totalPages)["next_page"],
                pokemons = pokemon
            )
        }
    }

    override suspend fun getPokemonById(id: Int): PokemonDetailResponse {
        return if (id in 1..280) {
            PokemonDetailResponse(
                success = true,
                message = "Ok",
                pokemon = PokemonDetail.POKEMON_DETAIL_1_280[id]!!
            )
        } else if (id in 218..560) {
            PokemonDetailResponse(
                success = true,
                message = "Ok",
                pokemon = PokemonDetail_2.POKEMON_DETAIL_281_560[id]!!
            )
        } else if (id in 561..840) {
            PokemonDetailResponse(
                success = true,
                message = "Ok",
                pokemon = PokemonDetail_3.POKEMON_DETAIL_561_840[id]!!
            )
        } else if (id in 841..10220) {
            PokemonDetailResponse(
                success = true,
                message = "Ok",
                pokemon = PokemonDetail_4.POKEMON_DETAIL_841_1118[id]!!
            )
        } else {
            PokemonDetailResponse(
                success = false,
                message = "Pokemon not found",
                pokemon = null
            )
        }
    }

    private fun calculatePage(page: Int, totalPages: Int): Map<String, Int?> {
        var prevPage: Int? = page

        if (page == 1) {
            prevPage = null
        }
        if (page > totalPages) {
            prevPage = totalPages
        }
        if (page <= totalPages && page != 1) {
            prevPage = page - 1
        }

        val nextPage: Int? = if (page >= totalPages) {
            null
        } else {
            page + 1
        }
        return mapOf("prev_page" to prevPage, "next_page" to nextPage)
    }

}