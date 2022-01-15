package com.example.di

import com.example.repository.PokemonRepository
import com.example.repository.PokemonRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<PokemonRepository> {
        PokemonRepositoryImpl()
    }
}