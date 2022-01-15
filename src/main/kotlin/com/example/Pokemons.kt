package com.example

import com.example.models.*

object Pokemons {

    val POKEMON_LIST = listOf(
        Pokemon(
            id = 1,
            name = "bulbasaur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 2,
            name = "ivysaur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 3,
            name = "venusaur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 4,
            name = "charmander",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 5,
            name = "charmeleon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 6,
            name = "charizard",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 7,
            name = "squirtle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 8,
            name = "wartortle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/8.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 9,
            name = "blastoise",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10,
            name = "caterpie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 11,
            name = "metapod",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/11.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 12,
            name = "butterfree",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/12.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 13,
            name = "weedle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/13.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 14,
            name = "kakuna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/14.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 15,
            name = "beedrill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/15.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 16,
            name = "pidgey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/16.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 17,
            name = "pidgeotto",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/17.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 18,
            name = "pidgeot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/18.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 19,
            name = "rattata",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/19.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 20,
            name = "raticate",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/20.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 21,
            name = "spearow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/21.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 22,
            name = "fearow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/22.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 23,
            name = "ekans",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/23.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 24,
            name = "arbok",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/24.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 25,
            name = "pikachu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 26,
            name = "raichu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/26.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 27,
            name = "sandshrew",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/27.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 28,
            name = "sandslash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/28.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 29,
            name = "nidoran-f",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/29.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 30,
            name = "nidorina",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/30.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 31,
            name = "nidoqueen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/31.png",
            types = listOf(Type(name = "poison"), Type(name = "ground"))
        ),
        Pokemon(
            id = 32,
            name = "nidoran-m",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/32.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 33,
            name = "nidorino",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/33.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 34,
            name = "nidoking",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/34.png",
            types = listOf(Type(name = "poison"), Type(name = "ground"))
        ),
        Pokemon(
            id = 35,
            name = "clefairy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/35.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 36,
            name = "clefable",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/36.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 37,
            name = "vulpix",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/37.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 38,
            name = "ninetales",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/38.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 39,
            name = "jigglypuff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/39.png",
            types = listOf(Type(name = "normal"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 40,
            name = "wigglytuff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/40.png",
            types = listOf(Type(name = "normal"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 41,
            name = "zubat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/41.png",
            types = listOf(Type(name = "poison"), Type(name = "flying"))
        ),
        Pokemon(
            id = 42,
            name = "golbat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/42.png",
            types = listOf(Type(name = "poison"), Type(name = "flying"))
        ),
        Pokemon(
            id = 43,
            name = "oddish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/43.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 44,
            name = "gloom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/44.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 45,
            name = "vileplume",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/45.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 46,
            name = "paras",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/46.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 47,
            name = "parasect",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/47.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 48,
            name = "venonat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/48.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 49,
            name = "venomoth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/49.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 50,
            name = "diglett",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/50.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 51,
            name = "dugtrio",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/51.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 52,
            name = "meowth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/52.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 53,
            name = "persian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/53.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 54,
            name = "psyduck",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/54.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 55,
            name = "golduck",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/55.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 56,
            name = "mankey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/56.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 57,
            name = "primeape",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/57.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 58,
            name = "growlithe",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/58.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 59,
            name = "arcanine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/59.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 60,
            name = "poliwag",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/60.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 61,
            name = "poliwhirl",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/61.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 62,
            name = "poliwrath",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/62.png",
            types = listOf(Type(name = "water"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 63,
            name = "abra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/63.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 64,
            name = "kadabra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/64.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 65,
            name = "alakazam",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/65.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 66,
            name = "machop",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/66.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 67,
            name = "machoke",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/67.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 68,
            name = "machamp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/68.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 69,
            name = "bellsprout",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/69.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 70,
            name = "weepinbell",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/70.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 71,
            name = "victreebel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/71.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 72,
            name = "tentacool",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/72.png",
            types = listOf(Type(name = "water"), Type(name = "poison"))
        ),
        Pokemon(
            id = 73,
            name = "tentacruel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/73.png",
            types = listOf(Type(name = "water"), Type(name = "poison"))
        ),
        Pokemon(
            id = 74,
            name = "geodude",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/74.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 75,
            name = "graveler",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/75.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 76,
            name = "golem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/76.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 77,
            name = "ponyta",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/77.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 78,
            name = "rapidash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/78.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 79,
            name = "slowpoke",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/79.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 80,
            name = "slowbro",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/80.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 81,
            name = "magnemite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/81.png",
            types = listOf(Type(name = "electric"), Type(name = "steel"))
        ),
        Pokemon(
            id = 82,
            name = "magneton",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/82.png",
            types = listOf(Type(name = "electric"), Type(name = "steel"))
        ),
        Pokemon(
            id = 83,
            name = "farfetchd",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/83.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 84,
            name = "doduo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/84.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 85,
            name = "dodrio",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/85.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 86,
            name = "seel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/86.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 87,
            name = "dewgong",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/87.png",
            types = listOf(Type(name = "water"), Type(name = "ice"))
        ),
        Pokemon(
            id = 88,
            name = "grimer",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/88.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 89,
            name = "muk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/89.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 90,
            name = "shellder",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/90.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 91,
            name = "cloyster",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/91.png",
            types = listOf(Type(name = "water"), Type(name = "ice"))
        ),
        Pokemon(
            id = 92,
            name = "gastly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/92.png",
            types = listOf(Type(name = "ghost"), Type(name = "poison"))
        ),
        Pokemon(
            id = 93,
            name = "haunter",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/93.png",
            types = listOf(Type(name = "ghost"), Type(name = "poison"))
        ),
        Pokemon(
            id = 94,
            name = "gengar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/94.png",
            types = listOf(Type(name = "ghost"), Type(name = "poison"))
        ),
        Pokemon(
            id = 95,
            name = "onix",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/95.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 96,
            name = "drowzee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/96.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 97,
            name = "hypno",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/97.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 98,
            name = "krabby",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/98.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 99,
            name = "kingler",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/99.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 100,
            name = "voltorb",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/100.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 101,
            name = "electrode",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/101.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 102,
            name = "exeggcute",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/102.png",
            types = listOf(Type(name = "grass"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 103,
            name = "exeggutor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/103.png",
            types = listOf(Type(name = "grass"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 104,
            name = "cubone",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/104.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 105,
            name = "marowak",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/105.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 106,
            name = "hitmonlee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/106.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 107,
            name = "hitmonchan",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/107.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 108,
            name = "lickitung",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/108.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 109,
            name = "koffing",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/109.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 110,
            name = "weezing",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/110.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 111,
            name = "rhyhorn",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/111.png",
            types = listOf(Type(name = "ground"), Type(name = "rock"))
        ),
        Pokemon(
            id = 112,
            name = "rhydon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/112.png",
            types = listOf(Type(name = "ground"), Type(name = "rock"))
        ),
        Pokemon(
            id = 113,
            name = "chansey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/113.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 114,
            name = "tangela",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/114.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 115,
            name = "kangaskhan",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/115.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 116,
            name = "horsea",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/116.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 117,
            name = "seadra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/117.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 118,
            name = "goldeen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/118.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 119,
            name = "seaking",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/119.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 120,
            name = "staryu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/120.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 121,
            name = "starmie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/121.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 122,
            name = "mr-mime",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/122.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 123,
            name = "scyther",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/123.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 124,
            name = "jynx",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/124.png",
            types = listOf(Type(name = "ice"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 125,
            name = "electabuzz",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/125.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 126,
            name = "magmar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/126.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 127,
            name = "pinsir",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/127.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 128,
            name = "tauros",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/128.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 129,
            name = "magikarp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/129.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 130,
            name = "gyarados",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/130.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 131,
            name = "lapras",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/131.png",
            types = listOf(Type(name = "water"), Type(name = "ice"))
        ),
        Pokemon(
            id = 132,
            name = "ditto",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 133,
            name = "eevee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/133.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 134,
            name = "vaporeon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/134.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 135,
            name = "jolteon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/135.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 136,
            name = "flareon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/136.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 137,
            name = "porygon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/137.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 138,
            name = "omanyte",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/138.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 139,
            name = "omastar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/139.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 140,
            name = "kabuto",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/140.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 141,
            name = "kabutops",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/141.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 142,
            name = "aerodactyl",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/142.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 143,
            name = "snorlax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/143.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 144,
            name = "articuno",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/144.png",
            types = listOf(Type(name = "ice"), Type(name = "flying"))
        ),
        Pokemon(
            id = 145,
            name = "zapdos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/145.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 146,
            name = "moltres",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 147,
            name = "dratini",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/147.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 148,
            name = "dragonair",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/148.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 149,
            name = "dragonite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/149.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 150,
            name = "mewtwo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 151,
            name = "mew",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/151.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 152,
            name = "chikorita",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/152.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 153,
            name = "bayleef",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/153.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 154,
            name = "meganium",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/154.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 155,
            name = "cyndaquil",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/155.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 156,
            name = "quilava",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/156.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 157,
            name = "typhlosion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/157.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 158,
            name = "totodile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/158.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 159,
            name = "croconaw",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/159.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 160,
            name = "feraligatr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/160.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 161,
            name = "sentret",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/161.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 162,
            name = "furret",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/162.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 163,
            name = "hoothoot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/163.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 164,
            name = "noctowl",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/164.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 165,
            name = "ledyba",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/165.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 166,
            name = "ledian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/166.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 167,
            name = "spinarak",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/167.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 168,
            name = "ariados",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/168.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 169,
            name = "crobat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/169.png",
            types = listOf(Type(name = "poison"), Type(name = "flying"))
        ),
        Pokemon(
            id = 170,
            name = "chinchou",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/170.png",
            types = listOf(Type(name = "water"), Type(name = "electric"))
        ),
        Pokemon(
            id = 171,
            name = "lanturn",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/171.png",
            types = listOf(Type(name = "water"), Type(name = "electric"))
        ),
        Pokemon(
            id = 172,
            name = "pichu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/172.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 173,
            name = "cleffa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/173.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 174,
            name = "igglybuff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/174.png",
            types = listOf(Type(name = "normal"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 175,
            name = "togepi",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/175.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 176,
            name = "togetic",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/176.png",
            types = listOf(Type(name = "fairy"), Type(name = "flying"))
        ),
        Pokemon(
            id = 177,
            name = "natu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/177.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 178,
            name = "xatu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/178.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 179,
            name = "mareep",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/179.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 180,
            name = "flaaffy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/180.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 181,
            name = "ampharos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/181.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 182,
            name = "bellossom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/182.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 183,
            name = "marill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/183.png",
            types = listOf(Type(name = "water"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 184,
            name = "azumarill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/184.png",
            types = listOf(Type(name = "water"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 185,
            name = "sudowoodo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/185.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 186,
            name = "politoed",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/186.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 187,
            name = "hoppip",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/187.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 188,
            name = "skiploom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/188.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 189,
            name = "jumpluff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/189.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 190,
            name = "aipom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/190.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 191,
            name = "sunkern",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/191.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 192,
            name = "sunflora",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/192.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 193,
            name = "yanma",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/193.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 194,
            name = "wooper",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/194.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 195,
            name = "quagsire",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/195.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 196,
            name = "espeon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/196.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 197,
            name = "umbreon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/197.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 198,
            name = "murkrow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/198.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 199,
            name = "slowking",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/199.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 200,
            name = "misdreavus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/200.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 201,
            name = "unown",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/201.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 202,
            name = "wobbuffet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/202.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 203,
            name = "girafarig",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/203.png",
            types = listOf(Type(name = "normal"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 204,
            name = "pineco",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/204.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 205,
            name = "forretress",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/205.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 206,
            name = "dunsparce",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/206.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 207,
            name = "gligar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/207.png",
            types = listOf(Type(name = "ground"), Type(name = "flying"))
        ),
        Pokemon(
            id = 208,
            name = "steelix",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/208.png",
            types = listOf(Type(name = "steel"), Type(name = "ground"))
        ),
        Pokemon(
            id = 209,
            name = "snubbull",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/209.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 210,
            name = "granbull",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/210.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 211,
            name = "qwilfish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/211.png",
            types = listOf(Type(name = "water"), Type(name = "poison"))
        ),
        Pokemon(
            id = 212,
            name = "scizor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/212.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 213,
            name = "shuckle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/213.png",
            types = listOf(Type(name = "bug"), Type(name = "rock"))
        ),
        Pokemon(
            id = 214,
            name = "heracross",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/214.png",
            types = listOf(Type(name = "bug"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 215,
            name = "sneasel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/215.png",
            types = listOf(Type(name = "dark"), Type(name = "ice"))
        ),
        Pokemon(
            id = 216,
            name = "teddiursa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/216.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 217,
            name = "ursaring",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/217.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 218,
            name = "slugma",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/218.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 219,
            name = "magcargo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/219.png",
            types = listOf(Type(name = "fire"), Type(name = "rock"))
        ),
        Pokemon(
            id = 220,
            name = "swinub",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/220.png",
            types = listOf(Type(name = "ice"), Type(name = "ground"))
        ),
        Pokemon(
            id = 221,
            name = "piloswine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/221.png",
            types = listOf(Type(name = "ice"), Type(name = "ground"))
        ),
        Pokemon(
            id = 222,
            name = "corsola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/222.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 223,
            name = "remoraid",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/223.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 224,
            name = "octillery",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/224.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 225,
            name = "delibird",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/225.png",
            types = listOf(Type(name = "ice"), Type(name = "flying"))
        ),
        Pokemon(
            id = 226,
            name = "mantine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/226.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 227,
            name = "skarmory",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/227.png",
            types = listOf(Type(name = "steel"), Type(name = "flying"))
        ),
        Pokemon(
            id = 228,
            name = "houndour",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/228.png",
            types = listOf(Type(name = "dark"), Type(name = "fire"))
        ),
        Pokemon(
            id = 229,
            name = "houndoom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/229.png",
            types = listOf(Type(name = "dark"), Type(name = "fire"))
        ),
        Pokemon(
            id = 230,
            name = "kingdra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/230.png",
            types = listOf(Type(name = "water"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 231,
            name = "phanpy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/231.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 232,
            name = "donphan",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/232.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 233,
            name = "porygon2",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/233.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 234,
            name = "stantler",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/234.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 235,
            name = "smeargle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/235.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 236,
            name = "tyrogue",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/236.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 237,
            name = "hitmontop",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/237.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 238,
            name = "smoochum",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/238.png",
            types = listOf(Type(name = "ice"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 239,
            name = "elekid",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/239.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 240,
            name = "magby",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/240.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 241,
            name = "miltank",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/241.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 242,
            name = "blissey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/242.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 243,
            name = "raikou",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/243.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 244,
            name = "entei",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/244.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 245,
            name = "suicune",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/245.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 246,
            name = "larvitar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/246.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 247,
            name = "pupitar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/247.png",
            types = listOf(Type(name = "rock"), Type(name = "ground"))
        ),
        Pokemon(
            id = 248,
            name = "tyranitar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/248.png",
            types = listOf(Type(name = "rock"), Type(name = "dark"))
        ),
        Pokemon(
            id = 249,
            name = "lugia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/249.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 250,
            name = "ho-oh",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/250.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 251,
            name = "celebi",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/251.png",
            types = listOf(Type(name = "psychic"), Type(name = "grass"))
        ),
        Pokemon(
            id = 252,
            name = "treecko",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/252.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 253,
            name = "grovyle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/253.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 254,
            name = "sceptile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/254.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 255,
            name = "torchic",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/255.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 256,
            name = "combusken",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/256.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 257,
            name = "blaziken",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/257.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 258,
            name = "mudkip",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/258.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 259,
            name = "marshtomp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/259.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 260,
            name = "swampert",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/260.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 261,
            name = "poochyena",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/261.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 262,
            name = "mightyena",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/262.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 263,
            name = "zigzagoon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/263.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 264,
            name = "linoone",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/264.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 265,
            name = "wurmple",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/265.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 266,
            name = "silcoon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/266.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 267,
            name = "beautifly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/267.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 268,
            name = "cascoon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/268.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 269,
            name = "dustox",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/269.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 270,
            name = "lotad",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/270.png",
            types = listOf(Type(name = "water"), Type(name = "grass"))
        ),
        Pokemon(
            id = 271,
            name = "lombre",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/271.png",
            types = listOf(Type(name = "water"), Type(name = "grass"))
        ),
        Pokemon(
            id = 272,
            name = "ludicolo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/272.png",
            types = listOf(Type(name = "water"), Type(name = "grass"))
        ),
        Pokemon(
            id = 273,
            name = "seedot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/273.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 274,
            name = "nuzleaf",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/274.png",
            types = listOf(Type(name = "grass"), Type(name = "dark"))
        ),
        Pokemon(
            id = 275,
            name = "shiftry",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/275.png",
            types = listOf(Type(name = "grass"), Type(name = "dark"))
        ),
        Pokemon(
            id = 276,
            name = "taillow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/276.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 277,
            name = "swellow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/277.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 278,
            name = "wingull",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/278.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 279,
            name = "pelipper",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/279.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 280,
            name = "ralts",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/280.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 281,
            name = "kirlia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/281.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 282,
            name = "gardevoir",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/282.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 283,
            name = "surskit",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/283.png",
            types = listOf(Type(name = "bug"), Type(name = "water"))
        ),
        Pokemon(
            id = 284,
            name = "masquerain",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/284.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 285,
            name = "shroomish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/285.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 286,
            name = "breloom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/286.png",
            types = listOf(Type(name = "grass"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 287,
            name = "slakoth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/287.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 288,
            name = "vigoroth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/288.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 289,
            name = "slaking",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/289.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 290,
            name = "nincada",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/290.png",
            types = listOf(Type(name = "bug"), Type(name = "ground"))
        ),
        Pokemon(
            id = 291,
            name = "ninjask",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/291.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 292,
            name = "shedinja",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/292.png",
            types = listOf(Type(name = "bug"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 293,
            name = "whismur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/293.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 294,
            name = "loudred",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/294.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 295,
            name = "exploud",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/295.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 296,
            name = "makuhita",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/296.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 297,
            name = "hariyama",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/297.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 298,
            name = "azurill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/298.png",
            types = listOf(Type(name = "normal"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 299,
            name = "nosepass",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/299.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 300,
            name = "skitty",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/300.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 301,
            name = "delcatty",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/301.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 302,
            name = "sableye",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/302.png",
            types = listOf(Type(name = "dark"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 303,
            name = "mawile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/303.png",
            types = listOf(Type(name = "steel"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 304,
            name = "aron",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/304.png",
            types = listOf(Type(name = "steel"), Type(name = "rock"))
        ),
        Pokemon(
            id = 305,
            name = "lairon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/305.png",
            types = listOf(Type(name = "steel"), Type(name = "rock"))
        ),
        Pokemon(
            id = 306,
            name = "aggron",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/306.png",
            types = listOf(Type(name = "steel"), Type(name = "rock"))
        ),
        Pokemon(
            id = 307,
            name = "meditite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/307.png",
            types = listOf(Type(name = "fighting"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 308,
            name = "medicham",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/308.png",
            types = listOf(Type(name = "fighting"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 309,
            name = "electrike",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/309.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 310,
            name = "manectric",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/310.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 311,
            name = "plusle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/311.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 312,
            name = "minun",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/312.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 313,
            name = "volbeat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/313.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 314,
            name = "illumise",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/314.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 315,
            name = "roselia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/315.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 316,
            name = "gulpin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/316.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 317,
            name = "swalot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/317.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 318,
            name = "carvanha",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/318.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 319,
            name = "sharpedo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/319.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 320,
            name = "wailmer",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/320.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 321,
            name = "wailord",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/321.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 322,
            name = "numel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/322.png",
            types = listOf(Type(name = "fire"), Type(name = "ground"))
        ),
        Pokemon(
            id = 323,
            name = "camerupt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/323.png",
            types = listOf(Type(name = "fire"), Type(name = "ground"))
        ),
        Pokemon(
            id = 324,
            name = "torkoal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/324.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 325,
            name = "spoink",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/325.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 326,
            name = "grumpig",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/326.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 327,
            name = "spinda",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/327.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 328,
            name = "trapinch",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/328.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 329,
            name = "vibrava",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/329.png",
            types = listOf(Type(name = "ground"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 330,
            name = "flygon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/330.png",
            types = listOf(Type(name = "ground"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 331,
            name = "cacnea",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/331.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 332,
            name = "cacturne",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/332.png",
            types = listOf(Type(name = "grass"), Type(name = "dark"))
        ),
        Pokemon(
            id = 333,
            name = "swablu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/333.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 334,
            name = "altaria",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/334.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 335,
            name = "zangoose",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/335.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 336,
            name = "seviper",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/336.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 337,
            name = "lunatone",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/337.png",
            types = listOf(Type(name = "rock"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 338,
            name = "solrock",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/338.png",
            types = listOf(Type(name = "rock"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 339,
            name = "barboach",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/339.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 340,
            name = "whiscash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/340.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 341,
            name = "corphish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/341.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 342,
            name = "crawdaunt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/342.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 343,
            name = "baltoy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/343.png",
            types = listOf(Type(name = "ground"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 344,
            name = "claydol",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/344.png",
            types = listOf(Type(name = "ground"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 345,
            name = "lileep",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/345.png",
            types = listOf(Type(name = "rock"), Type(name = "grass"))
        ),
        Pokemon(
            id = 346,
            name = "cradily",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/346.png",
            types = listOf(Type(name = "rock"), Type(name = "grass"))
        ),
        Pokemon(
            id = 347,
            name = "anorith",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/347.png",
            types = listOf(Type(name = "rock"), Type(name = "bug"))
        ),
        Pokemon(
            id = 348,
            name = "armaldo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/348.png",
            types = listOf(Type(name = "rock"), Type(name = "bug"))
        ),
        Pokemon(
            id = 349,
            name = "feebas",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/349.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 350,
            name = "milotic",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/350.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 351,
            name = "castform",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/351.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 352,
            name = "kecleon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/352.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 353,
            name = "shuppet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/353.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 354,
            name = "banette",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/354.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 355,
            name = "duskull",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/355.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 356,
            name = "dusclops",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/356.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 357,
            name = "tropius",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/357.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 358,
            name = "chimecho",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/358.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 359,
            name = "absol",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/359.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 360,
            name = "wynaut",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/360.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 361,
            name = "snorunt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/361.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 362,
            name = "glalie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/362.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 363,
            name = "spheal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/363.png",
            types = listOf(Type(name = "ice"), Type(name = "water"))
        ),
        Pokemon(
            id = 364,
            name = "sealeo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/364.png",
            types = listOf(Type(name = "ice"), Type(name = "water"))
        ),
        Pokemon(
            id = 365,
            name = "walrein",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/365.png",
            types = listOf(Type(name = "ice"), Type(name = "water"))
        ),
        Pokemon(
            id = 366,
            name = "clamperl",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/366.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 367,
            name = "huntail",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/367.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 368,
            name = "gorebyss",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/368.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 369,
            name = "relicanth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/369.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 370,
            name = "luvdisc",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/370.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 371,
            name = "bagon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/371.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 372,
            name = "shelgon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/372.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 373,
            name = "salamence",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/373.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 374,
            name = "beldum",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/374.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 375,
            name = "metang",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/375.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 376,
            name = "metagross",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/376.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 377,
            name = "regirock",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/377.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 378,
            name = "regice",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/378.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 379,
            name = "registeel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/379.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 380,
            name = "latias",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/380.png",
            types = listOf(Type(name = "dragon"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 381,
            name = "latios",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/381.png",
            types = listOf(Type(name = "dragon"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 382,
            name = "kyogre",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/382.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 383,
            name = "groudon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/383.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 384,
            name = "rayquaza",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/384.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 385,
            name = "jirachi",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/385.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 386,
            name = "deoxys-normal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/386.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 387,
            name = "turtwig",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/387.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 388,
            name = "grotle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/388.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 389,
            name = "torterra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/389.png",
            types = listOf(Type(name = "grass"), Type(name = "ground"))
        ),
        Pokemon(
            id = 390,
            name = "chimchar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/390.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 391,
            name = "monferno",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/391.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 392,
            name = "infernape",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/392.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 393,
            name = "piplup",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/393.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 394,
            name = "prinplup",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/394.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 395,
            name = "empoleon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/395.png",
            types = listOf(Type(name = "water"), Type(name = "steel"))
        ),
        Pokemon(
            id = 396,
            name = "starly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/396.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 397,
            name = "staravia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/397.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 398,
            name = "staraptor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/398.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 399,
            name = "bidoof",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/399.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 400,
            name = "bibarel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/400.png",
            types = listOf(Type(name = "normal"), Type(name = "water"))
        ),
        Pokemon(
            id = 401,
            name = "kricketot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/401.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 402,
            name = "kricketune",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/402.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 403,
            name = "shinx",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/403.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 404,
            name = "luxio",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/404.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 405,
            name = "luxray",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/405.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 406,
            name = "budew",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/406.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 407,
            name = "roserade",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/407.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 408,
            name = "cranidos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/408.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 409,
            name = "rampardos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/409.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 410,
            name = "shieldon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/410.png",
            types = listOf(Type(name = "rock"), Type(name = "steel"))
        ),
        Pokemon(
            id = 411,
            name = "bastiodon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/411.png",
            types = listOf(Type(name = "rock"), Type(name = "steel"))
        ),
        Pokemon(
            id = 412,
            name = "burmy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/412.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 413,
            name = "wormadam-plant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/413.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 414,
            name = "mothim",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/414.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 415,
            name = "combee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/415.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 416,
            name = "vespiquen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/416.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 417,
            name = "pachirisu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/417.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 418,
            name = "buizel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/418.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 419,
            name = "floatzel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/419.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 420,
            name = "cherubi",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/420.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 421,
            name = "cherrim",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/421.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 422,
            name = "shellos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/422.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 423,
            name = "gastrodon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/423.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 424,
            name = "ambipom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/424.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 425,
            name = "drifloon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/425.png",
            types = listOf(Type(name = "ghost"), Type(name = "flying"))
        ),
        Pokemon(
            id = 426,
            name = "drifblim",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/426.png",
            types = listOf(Type(name = "ghost"), Type(name = "flying"))
        ),
        Pokemon(
            id = 427,
            name = "buneary",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/427.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 428,
            name = "lopunny",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/428.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 429,
            name = "mismagius",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/429.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 430,
            name = "honchkrow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/430.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 431,
            name = "glameow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/431.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 432,
            name = "purugly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/432.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 433,
            name = "chingling",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/433.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 434,
            name = "stunky",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/434.png",
            types = listOf(Type(name = "poison"), Type(name = "dark"))
        ),
        Pokemon(
            id = 435,
            name = "skuntank",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/435.png",
            types = listOf(Type(name = "poison"), Type(name = "dark"))
        ),
        Pokemon(
            id = 436,
            name = "bronzor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/436.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 437,
            name = "bronzong",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/437.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 438,
            name = "bonsly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/438.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 439,
            name = "mime-jr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/439.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 440,
            name = "happiny",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/440.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 441,
            name = "chatot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/441.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 442,
            name = "spiritomb",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/442.png",
            types = listOf(Type(name = "ghost"), Type(name = "dark"))
        ),
        Pokemon(
            id = 443,
            name = "gible",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/443.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 444,
            name = "gabite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/444.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 445,
            name = "garchomp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/445.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 446,
            name = "munchlax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/446.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 447,
            name = "riolu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/447.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 448,
            name = "lucario",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/448.png",
            types = listOf(Type(name = "fighting"), Type(name = "steel"))
        ),
        Pokemon(
            id = 449,
            name = "hippopotas",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/449.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 450,
            name = "hippowdon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/450.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 451,
            name = "skorupi",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/451.png",
            types = listOf(Type(name = "poison"), Type(name = "bug"))
        ),
        Pokemon(
            id = 452,
            name = "drapion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/452.png",
            types = listOf(Type(name = "poison"), Type(name = "dark"))
        ),
        Pokemon(
            id = 453,
            name = "croagunk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/453.png",
            types = listOf(Type(name = "poison"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 454,
            name = "toxicroak",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/454.png",
            types = listOf(Type(name = "poison"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 455,
            name = "carnivine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/455.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 456,
            name = "finneon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/456.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 457,
            name = "lumineon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/457.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 458,
            name = "mantyke",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/458.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 459,
            name = "snover",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/459.png",
            types = listOf(Type(name = "grass"), Type(name = "ice"))
        ),
        Pokemon(
            id = 460,
            name = "abomasnow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/460.png",
            types = listOf(Type(name = "grass"), Type(name = "ice"))
        ),
        Pokemon(
            id = 461,
            name = "weavile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/461.png",
            types = listOf(Type(name = "dark"), Type(name = "ice"))
        ),
        Pokemon(
            id = 462,
            name = "magnezone",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/462.png",
            types = listOf(Type(name = "electric"), Type(name = "steel"))
        ),
        Pokemon(
            id = 463,
            name = "lickilicky",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/463.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 464,
            name = "rhyperior",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/464.png",
            types = listOf(Type(name = "ground"), Type(name = "rock"))
        ),
        Pokemon(
            id = 465,
            name = "tangrowth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/465.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 466,
            name = "electivire",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/466.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 467,
            name = "magmortar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/467.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 468,
            name = "togekiss",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/468.png",
            types = listOf(Type(name = "fairy"), Type(name = "flying"))
        ),
        Pokemon(
            id = 469,
            name = "yanmega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/469.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 470,
            name = "leafeon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/470.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 471,
            name = "glaceon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/471.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 472,
            name = "gliscor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/472.png",
            types = listOf(Type(name = "ground"), Type(name = "flying"))
        ),
        Pokemon(
            id = 473,
            name = "mamoswine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/473.png",
            types = listOf(Type(name = "ice"), Type(name = "ground"))
        ),
        Pokemon(
            id = 474,
            name = "porygon-z",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/474.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 475,
            name = "gallade",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/475.png",
            types = listOf(Type(name = "psychic"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 476,
            name = "probopass",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/476.png",
            types = listOf(Type(name = "rock"), Type(name = "steel"))
        ),
        Pokemon(
            id = 477,
            name = "dusknoir",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/477.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 478,
            name = "froslass",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/478.png",
            types = listOf(Type(name = "ice"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 479,
            name = "rotom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/479.png",
            types = listOf(Type(name = "electric"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 480,
            name = "uxie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/480.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 481,
            name = "mesprit",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/481.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 482,
            name = "azelf",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/482.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 483,
            name = "dialga",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/483.png",
            types = listOf(Type(name = "steel"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 484,
            name = "palkia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/484.png",
            types = listOf(Type(name = "water"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 485,
            name = "heatran",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/485.png",
            types = listOf(Type(name = "fire"), Type(name = "steel"))
        ),
        Pokemon(
            id = 486,
            name = "regigigas",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/486.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 487,
            name = "giratina-altered",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/487.png",
            types = listOf(Type(name = "ghost"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 488,
            name = "cresselia",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/488.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 489,
            name = "phione",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/489.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 490,
            name = "manaphy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/490.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 491,
            name = "darkrai",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/491.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 492,
            name = "shaymin-land",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/492.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 493,
            name = "arceus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/493.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 494,
            name = "victini",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/494.png",
            types = listOf(Type(name = "psychic"), Type(name = "fire"))
        ),
        Pokemon(
            id = 495,
            name = "snivy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/495.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 496,
            name = "servine",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/496.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 497,
            name = "serperior",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/497.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 498,
            name = "tepig",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/498.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 499,
            name = "pignite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/499.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 500,
            name = "emboar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/500.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 501,
            name = "oshawott",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/501.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 502,
            name = "dewott",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/502.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 503,
            name = "samurott",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/503.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 504,
            name = "patrat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/504.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 505,
            name = "watchog",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/505.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 506,
            name = "lillipup",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/506.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 507,
            name = "herdier",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/507.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 508,
            name = "stoutland",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/508.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 509,
            name = "purrloin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/509.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 510,
            name = "liepard",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/510.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 511,
            name = "pansage",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/511.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 512,
            name = "simisage",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/512.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 513,
            name = "pansear",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/513.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 514,
            name = "simisear",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/514.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 515,
            name = "panpour",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/515.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 516,
            name = "simipour",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/516.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 517,
            name = "munna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/517.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 518,
            name = "musharna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/518.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 519,
            name = "pidove",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/519.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 520,
            name = "tranquill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/520.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 521,
            name = "unfezant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/521.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 522,
            name = "blitzle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/522.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 523,
            name = "zebstrika",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/523.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 524,
            name = "roggenrola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/524.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 525,
            name = "boldore",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/525.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 526,
            name = "gigalith",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/526.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 527,
            name = "woobat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/527.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 528,
            name = "swoobat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/528.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 529,
            name = "drilbur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/529.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 530,
            name = "excadrill",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/530.png",
            types = listOf(Type(name = "ground"), Type(name = "steel"))
        ),
        Pokemon(
            id = 531,
            name = "audino",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/531.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 532,
            name = "timburr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/532.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 533,
            name = "gurdurr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/533.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 534,
            name = "conkeldurr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/534.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 535,
            name = "tympole",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/535.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 536,
            name = "palpitoad",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/536.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 537,
            name = "seismitoad",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/537.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 538,
            name = "throh",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/538.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 539,
            name = "sawk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/539.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 540,
            name = "sewaddle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/540.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 541,
            name = "swadloon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/541.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 542,
            name = "leavanny",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/542.png",
            types = listOf(Type(name = "bug"), Type(name = "grass"))
        ),
        Pokemon(
            id = 543,
            name = "venipede",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/543.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 544,
            name = "whirlipede",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/544.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 545,
            name = "scolipede",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/545.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 546,
            name = "cottonee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/546.png",
            types = listOf(Type(name = "grass"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 547,
            name = "whimsicott",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/547.png",
            types = listOf(Type(name = "grass"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 548,
            name = "petilil",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/548.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 549,
            name = "lilligant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/549.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 550,
            name = "basculin-red-striped",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/550.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 551,
            name = "sandile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/551.png",
            types = listOf(Type(name = "ground"), Type(name = "dark"))
        ),
        Pokemon(
            id = 552,
            name = "krokorok",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/552.png",
            types = listOf(Type(name = "ground"), Type(name = "dark"))
        ),
        Pokemon(
            id = 553,
            name = "krookodile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/553.png",
            types = listOf(Type(name = "ground"), Type(name = "dark"))
        ),
        Pokemon(
            id = 554,
            name = "darumaka",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/554.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 555,
            name = "darmanitan-standard",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/555.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 556,
            name = "maractus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/556.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 557,
            name = "dwebble",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/557.png",
            types = listOf(Type(name = "bug"), Type(name = "rock"))
        ),
        Pokemon(
            id = 558,
            name = "crustle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/558.png",
            types = listOf(Type(name = "bug"), Type(name = "rock"))
        ),
        Pokemon(
            id = 559,
            name = "scraggy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/559.png",
            types = listOf(Type(name = "dark"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 560,
            name = "scrafty",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/560.png",
            types = listOf(Type(name = "dark"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 561,
            name = "sigilyph",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/561.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 562,
            name = "yamask",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/562.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 563,
            name = "cofagrigus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/563.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 564,
            name = "tirtouga",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/564.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 565,
            name = "carracosta",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/565.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 566,
            name = "archen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/566.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 567,
            name = "archeops",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/567.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 568,
            name = "trubbish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/568.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 569,
            name = "garbodor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/569.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 570,
            name = "zorua",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/570.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 571,
            name = "zoroark",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/571.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 572,
            name = "minccino",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/572.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 573,
            name = "cinccino",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/573.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 574,
            name = "gothita",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/574.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 575,
            name = "gothorita",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/575.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 576,
            name = "gothitelle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/576.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 577,
            name = "solosis",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/577.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 578,
            name = "duosion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/578.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 579,
            name = "reuniclus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/579.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 580,
            name = "ducklett",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/580.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 581,
            name = "swanna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/581.png",
            types = listOf(Type(name = "water"), Type(name = "flying"))
        ),
        Pokemon(
            id = 582,
            name = "vanillite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/582.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 583,
            name = "vanillish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/583.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 584,
            name = "vanilluxe",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/584.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 585,
            name = "deerling",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/585.png",
            types = listOf(Type(name = "normal"), Type(name = "grass"))
        ),
        Pokemon(
            id = 586,
            name = "sawsbuck",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/586.png",
            types = listOf(Type(name = "normal"), Type(name = "grass"))
        ),
        Pokemon(
            id = 587,
            name = "emolga",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/587.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 588,
            name = "karrablast",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/588.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 589,
            name = "escavalier",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/589.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 590,
            name = "foongus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/590.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 591,
            name = "amoonguss",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/591.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 592,
            name = "frillish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/592.png",
            types = listOf(Type(name = "water"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 593,
            name = "jellicent",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/593.png",
            types = listOf(Type(name = "water"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 594,
            name = "alomomola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/594.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 595,
            name = "joltik",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/595.png",
            types = listOf(Type(name = "bug"), Type(name = "electric"))
        ),
        Pokemon(
            id = 596,
            name = "galvantula",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/596.png",
            types = listOf(Type(name = "bug"), Type(name = "electric"))
        ),
        Pokemon(
            id = 597,
            name = "ferroseed",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/597.png",
            types = listOf(Type(name = "grass"), Type(name = "steel"))
        ),
        Pokemon(
            id = 598,
            name = "ferrothorn",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/598.png",
            types = listOf(Type(name = "grass"), Type(name = "steel"))
        ),
        Pokemon(
            id = 599,
            name = "klink",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/599.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 600,
            name = "klang",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/600.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 601,
            name = "klinklang",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/601.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 602,
            name = "tynamo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/602.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 603,
            name = "eelektrik",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/603.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 604,
            name = "eelektross",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/604.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 605,
            name = "elgyem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/605.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 606,
            name = "beheeyem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/606.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 607,
            name = "litwick",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/607.png",
            types = listOf(Type(name = "ghost"), Type(name = "fire"))
        ),
        Pokemon(
            id = 608,
            name = "lampent",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/608.png",
            types = listOf(Type(name = "ghost"), Type(name = "fire"))
        ),
        Pokemon(
            id = 609,
            name = "chandelure",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/609.png",
            types = listOf(Type(name = "ghost"), Type(name = "fire"))
        ),
        Pokemon(
            id = 610,
            name = "axew",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/610.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 611,
            name = "fraxure",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/611.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 612,
            name = "haxorus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/612.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 613,
            name = "cubchoo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/613.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 614,
            name = "beartic",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/614.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 615,
            name = "cryogonal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/615.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 616,
            name = "shelmet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/616.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 617,
            name = "accelgor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/617.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 618,
            name = "stunfisk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/618.png",
            types = listOf(Type(name = "ground"), Type(name = "electric"))
        ),
        Pokemon(
            id = 619,
            name = "mienfoo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/619.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 620,
            name = "mienshao",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/620.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 621,
            name = "druddigon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/621.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 622,
            name = "golett",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/622.png",
            types = listOf(Type(name = "ground"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 623,
            name = "golurk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/623.png",
            types = listOf(Type(name = "ground"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 624,
            name = "pawniard",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/624.png",
            types = listOf(Type(name = "dark"), Type(name = "steel"))
        ),
        Pokemon(
            id = 625,
            name = "bisharp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/625.png",
            types = listOf(Type(name = "dark"), Type(name = "steel"))
        ),
        Pokemon(
            id = 626,
            name = "bouffalant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/626.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 627,
            name = "rufflet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/627.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 628,
            name = "braviary",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/628.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 629,
            name = "vullaby",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/629.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 630,
            name = "mandibuzz",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/630.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 631,
            name = "heatmor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/631.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 632,
            name = "durant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/632.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 633,
            name = "deino",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/633.png",
            types = listOf(Type(name = "dark"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 634,
            name = "zweilous",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/634.png",
            types = listOf(Type(name = "dark"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 635,
            name = "hydreigon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/635.png",
            types = listOf(Type(name = "dark"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 636,
            name = "larvesta",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/636.png",
            types = listOf(Type(name = "bug"), Type(name = "fire"))
        ),
        Pokemon(
            id = 637,
            name = "volcarona",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/637.png",
            types = listOf(Type(name = "bug"), Type(name = "fire"))
        ),
        Pokemon(
            id = 638,
            name = "cobalion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/638.png",
            types = listOf(Type(name = "steel"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 639,
            name = "terrakion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/639.png",
            types = listOf(Type(name = "rock"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 640,
            name = "virizion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/640.png",
            types = listOf(Type(name = "grass"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 641,
            name = "tornadus-incarnate",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/641.png",
            types = listOf(Type(name = "flying"))
        ),
        Pokemon(
            id = 642,
            name = "thundurus-incarnate",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/642.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 643,
            name = "reshiram",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/643.png",
            types = listOf(Type(name = "dragon"), Type(name = "fire"))
        ),
        Pokemon(
            id = 644,
            name = "zekrom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/644.png",
            types = listOf(Type(name = "dragon"), Type(name = "electric"))
        ),
        Pokemon(
            id = 645,
            name = "landorus-incarnate",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/645.png",
            types = listOf(Type(name = "ground"), Type(name = "flying"))
        ),
        Pokemon(
            id = 646,
            name = "kyurem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/646.png",
            types = listOf(Type(name = "dragon"), Type(name = "ice"))
        ),
        Pokemon(
            id = 647,
            name = "keldeo-ordinary",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/647.png",
            types = listOf(Type(name = "water"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 648,
            name = "meloetta-aria",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/648.png",
            types = listOf(Type(name = "normal"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 649,
            name = "genesect",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/649.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 650,
            name = "chespin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/650.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 651,
            name = "quilladin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/651.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 652,
            name = "chesnaught",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/652.png",
            types = listOf(Type(name = "grass"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 653,
            name = "fennekin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/653.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 654,
            name = "braixen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/654.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 655,
            name = "delphox",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/655.png",
            types = listOf(Type(name = "fire"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 656,
            name = "froakie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/656.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 657,
            name = "frogadier",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/657.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 658,
            name = "greninja",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/658.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 659,
            name = "bunnelby",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/659.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 660,
            name = "diggersby",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/660.png",
            types = listOf(Type(name = "normal"), Type(name = "ground"))
        ),
        Pokemon(
            id = 661,
            name = "fletchling",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/661.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 662,
            name = "fletchinder",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/662.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 663,
            name = "talonflame",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/663.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 664,
            name = "scatterbug",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/664.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 665,
            name = "spewpa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/665.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 666,
            name = "vivillon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/666.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 667,
            name = "litleo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/667.png",
            types = listOf(Type(name = "fire"), Type(name = "normal"))
        ),
        Pokemon(
            id = 668,
            name = "pyroar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/668.png",
            types = listOf(Type(name = "fire"), Type(name = "normal"))
        ),
        Pokemon(
            id = 669,
            name = "flabebe",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/669.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 670,
            name = "floette",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/670.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 671,
            name = "florges",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/671.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 672,
            name = "skiddo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/672.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 673,
            name = "gogoat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/673.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 674,
            name = "pancham",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/674.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 675,
            name = "pangoro",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/675.png",
            types = listOf(Type(name = "fighting"), Type(name = "dark"))
        ),
        Pokemon(
            id = 676,
            name = "furfrou",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/676.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 677,
            name = "espurr",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/677.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 678,
            name = "meowstic-male",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/678.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 679,
            name = "honedge",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/679.png",
            types = listOf(Type(name = "steel"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 680,
            name = "doublade",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/680.png",
            types = listOf(Type(name = "steel"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 681,
            name = "aegislash-shield",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/681.png",
            types = listOf(Type(name = "steel"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 682,
            name = "spritzee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/682.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 683,
            name = "aromatisse",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/683.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 684,
            name = "swirlix",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/684.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 685,
            name = "slurpuff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/685.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 686,
            name = "inkay",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/686.png",
            types = listOf(Type(name = "dark"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 687,
            name = "malamar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/687.png",
            types = listOf(Type(name = "dark"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 688,
            name = "binacle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/688.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 689,
            name = "barbaracle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/689.png",
            types = listOf(Type(name = "rock"), Type(name = "water"))
        ),
        Pokemon(
            id = 690,
            name = "skrelp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/690.png",
            types = listOf(Type(name = "poison"), Type(name = "water"))
        ),
        Pokemon(
            id = 691,
            name = "dragalge",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/691.png",
            types = listOf(Type(name = "poison"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 692,
            name = "clauncher",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/692.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 693,
            name = "clawitzer",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/693.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 694,
            name = "helioptile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/694.png",
            types = listOf(Type(name = "electric"), Type(name = "normal"))
        ),
        Pokemon(
            id = 695,
            name = "heliolisk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/695.png",
            types = listOf(Type(name = "electric"), Type(name = "normal"))
        ),
        Pokemon(
            id = 696,
            name = "tyrunt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/696.png",
            types = listOf(Type(name = "rock"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 697,
            name = "tyrantrum",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/697.png",
            types = listOf(Type(name = "rock"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 698,
            name = "amaura",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/698.png",
            types = listOf(Type(name = "rock"), Type(name = "ice"))
        ),
        Pokemon(
            id = 699,
            name = "aurorus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/699.png",
            types = listOf(Type(name = "rock"), Type(name = "ice"))
        ),
        Pokemon(
            id = 700,
            name = "sylveon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/700.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 701,
            name = "hawlucha",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/701.png",
            types = listOf(Type(name = "fighting"), Type(name = "flying"))
        ),
        Pokemon(
            id = 702,
            name = "dedenne",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/702.png",
            types = listOf(Type(name = "electric"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 703,
            name = "carbink",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/703.png",
            types = listOf(Type(name = "rock"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 704,
            name = "goomy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/704.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 705,
            name = "sliggoo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/705.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 706,
            name = "goodra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/706.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 707,
            name = "klefki",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/707.png",
            types = listOf(Type(name = "steel"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 708,
            name = "phantump",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/708.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 709,
            name = "trevenant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/709.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 710,
            name = "pumpkaboo-average",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/710.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 711,
            name = "gourgeist-average",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/711.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 712,
            name = "bergmite",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/712.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 713,
            name = "avalugg",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/713.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 714,
            name = "noibat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/714.png",
            types = listOf(Type(name = "flying"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 715,
            name = "noivern",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/715.png",
            types = listOf(Type(name = "flying"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 716,
            name = "xerneas",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/716.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 717,
            name = "yveltal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/717.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 718,
            name = "zygarde",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/718.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 719,
            name = "diancie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/719.png",
            types = listOf(Type(name = "rock"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 720,
            name = "hoopa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/720.png",
            types = listOf(Type(name = "psychic"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 721,
            name = "volcanion",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/721.png",
            types = listOf(Type(name = "fire"), Type(name = "water"))
        ),
        Pokemon(
            id = 722,
            name = "rowlet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/722.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 723,
            name = "dartrix",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/723.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 724,
            name = "decidueye",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/724.png",
            types = listOf(Type(name = "grass"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 725,
            name = "litten",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/725.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 726,
            name = "torracat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/726.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 727,
            name = "incineroar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/727.png",
            types = listOf(Type(name = "fire"), Type(name = "dark"))
        ),
        Pokemon(
            id = 728,
            name = "popplio",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/728.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 729,
            name = "brionne",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/729.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 730,
            name = "primarina",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/730.png",
            types = listOf(Type(name = "water"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 731,
            name = "pikipek",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/731.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 732,
            name = "trumbeak",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/732.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 733,
            name = "toucannon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/733.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 734,
            name = "yungoos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/734.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 735,
            name = "gumshoos",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/735.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 736,
            name = "grubbin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/736.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 737,
            name = "charjabug",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/737.png",
            types = listOf(Type(name = "bug"), Type(name = "electric"))
        ),
        Pokemon(
            id = 738,
            name = "vikavolt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/738.png",
            types = listOf(Type(name = "bug"), Type(name = "electric"))
        ),
        Pokemon(
            id = 739,
            name = "crabrawler",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/739.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 740,
            name = "crabominable",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/740.png",
            types = listOf(Type(name = "fighting"), Type(name = "ice"))
        ),
        Pokemon(
            id = 741,
            name = "oricorio-baile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/741.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 742,
            name = "cutiefly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/742.png",
            types = listOf(Type(name = "bug"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 743,
            name = "ribombee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/743.png",
            types = listOf(Type(name = "bug"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 744,
            name = "rockruff",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/744.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 745,
            name = "lycanroc-midday",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/745.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 746,
            name = "wishiwashi-solo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/746.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 747,
            name = "mareanie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/747.png",
            types = listOf(Type(name = "poison"), Type(name = "water"))
        ),
        Pokemon(
            id = 748,
            name = "toxapex",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/748.png",
            types = listOf(Type(name = "poison"), Type(name = "water"))
        ),
        Pokemon(
            id = 749,
            name = "mudbray",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/749.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 750,
            name = "mudsdale",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/750.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 751,
            name = "dewpider",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/751.png",
            types = listOf(Type(name = "water"), Type(name = "bug"))
        ),
        Pokemon(
            id = 752,
            name = "araquanid",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/752.png",
            types = listOf(Type(name = "water"), Type(name = "bug"))
        ),
        Pokemon(
            id = 753,
            name = "fomantis",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/753.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 754,
            name = "lurantis",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/754.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 755,
            name = "morelull",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/755.png",
            types = listOf(Type(name = "grass"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 756,
            name = "shiinotic",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/756.png",
            types = listOf(Type(name = "grass"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 757,
            name = "salandit",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/757.png",
            types = listOf(Type(name = "poison"), Type(name = "fire"))
        ),
        Pokemon(
            id = 758,
            name = "salazzle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/758.png",
            types = listOf(Type(name = "poison"), Type(name = "fire"))
        ),
        Pokemon(
            id = 759,
            name = "stufful",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/759.png",
            types = listOf(Type(name = "normal"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 760,
            name = "bewear",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/760.png",
            types = listOf(Type(name = "normal"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 761,
            name = "bounsweet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/761.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 762,
            name = "steenee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/762.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 763,
            name = "tsareena",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/763.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 764,
            name = "comfey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/764.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 765,
            name = "oranguru",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/765.png",
            types = listOf(Type(name = "normal"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 766,
            name = "passimian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/766.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 767,
            name = "wimpod",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/767.png",
            types = listOf(Type(name = "bug"), Type(name = "water"))
        ),
        Pokemon(
            id = 768,
            name = "golisopod",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/768.png",
            types = listOf(Type(name = "bug"), Type(name = "water"))
        ),
        Pokemon(
            id = 769,
            name = "sandygast",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/769.png",
            types = listOf(Type(name = "ghost"), Type(name = "ground"))
        ),
        Pokemon(
            id = 770,
            name = "palossand",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/770.png",
            types = listOf(Type(name = "ghost"), Type(name = "ground"))
        ),
        Pokemon(
            id = 771,
            name = "pyukumuku",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/771.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 772,
            name = "type-null",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/772.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 773,
            name = "silvally",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/773.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 774,
            name = "minior-red-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/774.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 775,
            name = "komala",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/775.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 776,
            name = "turtonator",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/776.png",
            types = listOf(Type(name = "fire"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 777,
            name = "togedemaru",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/777.png",
            types = listOf(Type(name = "electric"), Type(name = "steel"))
        ),
        Pokemon(
            id = 778,
            name = "mimikyu-disguised",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/778.png",
            types = listOf(Type(name = "ghost"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 779,
            name = "bruxish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/779.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 780,
            name = "drampa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/780.png",
            types = listOf(Type(name = "normal"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 781,
            name = "dhelmise",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/781.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 782,
            name = "jangmo-o",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/782.png",
            types = listOf(Type(name = "dragon"))
        ),
        Pokemon(
            id = 783,
            name = "hakamo-o",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/783.png",
            types = listOf(Type(name = "dragon"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 784,
            name = "kommo-o",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/784.png",
            types = listOf(Type(name = "dragon"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 785,
            name = "tapu-koko",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/785.png",
            types = listOf(Type(name = "electric"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 786,
            name = "tapu-lele",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/786.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 787,
            name = "tapu-bulu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/787.png",
            types = listOf(Type(name = "grass"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 788,
            name = "tapu-fini",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/788.png",
            types = listOf(Type(name = "water"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 789,
            name = "cosmog",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/789.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 790,
            name = "cosmoem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/790.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 791,
            name = "solgaleo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/791.png",
            types = listOf(Type(name = "psychic"), Type(name = "steel"))
        ),
        Pokemon(
            id = 792,
            name = "lunala",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/792.png",
            types = listOf(Type(name = "psychic"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 793,
            name = "nihilego",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/793.png",
            types = listOf(Type(name = "rock"), Type(name = "poison"))
        ),
        Pokemon(
            id = 794,
            name = "buzzwole",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/794.png",
            types = listOf(Type(name = "bug"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 795,
            name = "pheromosa",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/795.png",
            types = listOf(Type(name = "bug"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 796,
            name = "xurkitree",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/796.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 797,
            name = "celesteela",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/797.png",
            types = listOf(Type(name = "steel"), Type(name = "flying"))
        ),
        Pokemon(
            id = 798,
            name = "kartana",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/798.png",
            types = listOf(Type(name = "grass"), Type(name = "steel"))
        ),
        Pokemon(
            id = 799,
            name = "guzzlord",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/799.png",
            types = listOf(Type(name = "dark"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 800,
            name = "necrozma",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/800.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 801,
            name = "magearna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/801.png",
            types = listOf(Type(name = "steel"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 802,
            name = "marshadow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/802.png",
            types = listOf(Type(name = "fighting"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 803,
            name = "poipole",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/803.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 804,
            name = "naganadel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/804.png",
            types = listOf(Type(name = "poison"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 805,
            name = "stakataka",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/805.png",
            types = listOf(Type(name = "rock"), Type(name = "steel"))
        ),
        Pokemon(
            id = 806,
            name = "blacephalon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/806.png",
            types = listOf(Type(name = "fire"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 807,
            name = "zeraora",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/807.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 808,
            name = "meltan",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/808.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 809,
            name = "melmetal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/809.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 810,
            name = "grookey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/810.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 811,
            name = "thwackey",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/811.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 812,
            name = "rillaboom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/812.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 813,
            name = "scorbunny",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/813.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 814,
            name = "raboot",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/814.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 815,
            name = "cinderace",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/815.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 816,
            name = "sobble",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/816.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 817,
            name = "drizzile",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/817.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 818,
            name = "inteleon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/818.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 819,
            name = "skwovet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/819.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 820,
            name = "greedent",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/820.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 821,
            name = "rookidee",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/821.png",
            types = listOf(Type(name = "flying"))
        ),
        Pokemon(
            id = 822,
            name = "corvisquire",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/822.png",
            types = listOf(Type(name = "flying"))
        ),
        Pokemon(
            id = 823,
            name = "corviknight",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/823.png",
            types = listOf(Type(name = "flying"), Type(name = "steel"))
        ),
        Pokemon(
            id = 824,
            name = "blipbug",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/824.png",
            types = listOf(Type(name = "bug"))
        ),
        Pokemon(
            id = 825,
            name = "dottler",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/825.png",
            types = listOf(Type(name = "bug"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 826,
            name = "orbeetle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/826.png",
            types = listOf(Type(name = "bug"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 827,
            name = "nickit",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/827.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 828,
            name = "thievul",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/828.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 829,
            name = "gossifleur",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/829.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 830,
            name = "eldegoss",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/830.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 831,
            name = "wooloo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/831.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 832,
            name = "dubwool",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/832.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 833,
            name = "chewtle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/833.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 834,
            name = "drednaw",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/834.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 835,
            name = "yamper",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/835.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 836,
            name = "boltund",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/836.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 837,
            name = "rolycoly",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/837.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 838,
            name = "carkol",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/838.png",
            types = listOf(Type(name = "rock"), Type(name = "fire"))
        ),
        Pokemon(
            id = 839,
            name = "coalossal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/839.png",
            types = listOf(Type(name = "rock"), Type(name = "fire"))
        ),
        Pokemon(
            id = 840,
            name = "applin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/840.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 841,
            name = "flapple",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/841.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 842,
            name = "appletun",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/842.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 843,
            name = "silicobra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/843.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 844,
            name = "sandaconda",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/844.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 845,
            name = "cramorant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/845.png",
            types = listOf(Type(name = "flying"), Type(name = "water"))
        ),
        Pokemon(
            id = 846,
            name = "arrokuda",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/846.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 847,
            name = "barraskewda",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/847.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 848,
            name = "toxel",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/848.png",
            types = listOf(Type(name = "electric"), Type(name = "poison"))
        ),
        Pokemon(
            id = 849,
            name = "toxtricity-amped",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/849.png",
            types = listOf(Type(name = "electric"), Type(name = "poison"))
        ),
        Pokemon(
            id = 850,
            name = "sizzlipede",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/850.png",
            types = listOf(Type(name = "fire"), Type(name = "bug"))
        ),
        Pokemon(
            id = 851,
            name = "centiskorch",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/851.png",
            types = listOf(Type(name = "fire"), Type(name = "bug"))
        ),
        Pokemon(
            id = 852,
            name = "clobbopus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/852.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 853,
            name = "grapploct",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/853.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 854,
            name = "sinistea",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/854.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 855,
            name = "polteageist",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/855.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 856,
            name = "hatenna",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/856.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 857,
            name = "hattrem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/857.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 858,
            name = "hatterene",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/858.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 859,
            name = "impidimp",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/859.png",
            types = listOf(Type(name = "dark"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 860,
            name = "morgrem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/860.png",
            types = listOf(Type(name = "dark"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 861,
            name = "grimmsnarl",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/861.png",
            types = listOf(Type(name = "dark"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 862,
            name = "obstagoon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/862.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 863,
            name = "perrserker",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/863.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 864,
            name = "cursola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/864.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 865,
            name = "sirfetchd",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/865.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 866,
            name = "mr-rime",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/866.png",
            types = listOf(Type(name = "ice"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 867,
            name = "runerigus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/867.png",
            types = listOf(Type(name = "ground"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 868,
            name = "milcery",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/868.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 869,
            name = "alcremie",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/869.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 870,
            name = "falinks",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/870.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 871,
            name = "pincurchin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/871.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 872,
            name = "snom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/872.png",
            types = listOf(Type(name = "ice"), Type(name = "bug"))
        ),
        Pokemon(
            id = 873,
            name = "frosmoth",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/873.png",
            types = listOf(Type(name = "ice"), Type(name = "bug"))
        ),
        Pokemon(
            id = 874,
            name = "stonjourner",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/874.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 875,
            name = "eiscue-ice",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/875.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 876,
            name = "indeedee-male",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/876.png",
            types = listOf(Type(name = "psychic"), Type(name = "normal"))
        ),
        Pokemon(
            id = 877,
            name = "morpeko",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/877.png",
            types = listOf(Type(name = "electric"), Type(name = "dark"))
        ),
        Pokemon(
            id = 878,
            name = "cufant",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/878.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 879,
            name = "copperajah",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/879.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 880,
            name = "dracozolt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/880.png",
            types = listOf(Type(name = "electric"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 881,
            name = "arctozolt",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/881.png",
            types = listOf(Type(name = "electric"), Type(name = "ice"))
        ),
        Pokemon(
            id = 882,
            name = "dracovish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/882.png",
            types = listOf(Type(name = "water"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 883,
            name = "arctovish",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/883.png",
            types = listOf(Type(name = "water"), Type(name = "ice"))
        ),
        Pokemon(
            id = 884,
            name = "duraludon",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/884.png",
            types = listOf(Type(name = "steel"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 885,
            name = "dreepy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/885.png",
            types = listOf(Type(name = "dragon"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 886,
            name = "drakloak",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/886.png",
            types = listOf(Type(name = "dragon"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 887,
            name = "dragapult",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/887.png",
            types = listOf(Type(name = "dragon"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 888,
            name = "zacian-hero",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/888.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 889,
            name = "zamazenta-hero",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/889.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 890,
            name = "eternatus",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/890.png",
            types = listOf(Type(name = "poison"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 891,
            name = "kubfu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/891.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 892,
            name = "urshifu-single-strike",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/892.png",
            types = listOf(Type(name = "fighting"), Type(name = "dark"))
        ),
        Pokemon(
            id = 893,
            name = "zarude",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/893.png",
            types = listOf(Type(name = "dark"), Type(name = "grass"))
        ),
        Pokemon(
            id = 894,
            name = "regieleki",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/894.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 896,
            name = "glastrier",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/896.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 897,
            name = "spectrier",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/897.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 898,
            name = "calyrex",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/898.png",
            types = listOf(Type(name = "psychic"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10001,
            name = "deoxys-attack",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10001.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10002,
            name = "deoxys-defense",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10002.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10003,
            name = "deoxys-speed",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10003.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10004,
            name = "wormadam-sandy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10004.png",
            types = listOf(Type(name = "bug"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10005,
            name = "wormadam-trash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10005.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10006,
            name = "shaymin-sky",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10006.png",
            types = listOf(Type(name = "grass"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10007,
            name = "giratina-origin",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10007.png",
            types = listOf(Type(name = "ghost"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10008,
            name = "rotom-heat",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10008.png",
            types = listOf(Type(name = "electric"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10009,
            name = "rotom-wash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10009.png",
            types = listOf(Type(name = "electric"), Type(name = "water"))
        ),
        Pokemon(
            id = 10010,
            name = "rotom-frost",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10010.png",
            types = listOf(Type(name = "electric"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10011,
            name = "rotom-fan",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10011.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10012,
            name = "rotom-mow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10012.png",
            types = listOf(Type(name = "electric"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10013,
            name = "castform-sunny",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10013.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 10014,
            name = "castform-rainy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10014.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10015,
            name = "castform-snowy",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10015.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10016,
            name = "basculin-blue-striped",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10016.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10017,
            name = "darmanitan-zen",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10017.png",
            types = listOf(Type(name = "fire"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10018,
            name = "meloetta-pirouette",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10018.png",
            types = listOf(Type(name = "normal"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10019,
            name = "tornadus-therian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10019.png",
            types = listOf(Type(name = "flying"))
        ),
        Pokemon(
            id = 10020,
            name = "thundurus-therian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10020.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10021,
            name = "landorus-therian",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10021.png",
            types = listOf(Type(name = "ground"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10022,
            name = "kyurem-black",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10022.png",
            types = listOf(Type(name = "dragon"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10023,
            name = "kyurem-white",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10023.png",
            types = listOf(Type(name = "dragon"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10024,
            name = "keldeo-resolute",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10024.png",
            types = listOf(Type(name = "water"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10025,
            name = "meowstic-female",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10025.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10026,
            name = "aegislash-blade",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10026.png",
            types = listOf(Type(name = "steel"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10027,
            name = "pumpkaboo-small",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10027.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10028,
            name = "pumpkaboo-large",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10028.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10029,
            name = "pumpkaboo-super",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10029.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10030,
            name = "gourgeist-small",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10030.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10031,
            name = "gourgeist-large",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10031.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10032,
            name = "gourgeist-super",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10032.png",
            types = listOf(Type(name = "ghost"), Type(name = "grass"))
        ),
        Pokemon(
            id = 10033,
            name = "venusaur-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10033.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10034,
            name = "charizard-mega-x",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10034.png",
            types = listOf(Type(name = "fire"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10035,
            name = "charizard-mega-y",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10035.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10036,
            name = "blastoise-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10036.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10037,
            name = "alakazam-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10037.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10038,
            name = "gengar-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10038.png",
            types = listOf(Type(name = "ghost"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10039,
            name = "kangaskhan-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10039.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 10040,
            name = "pinsir-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10040.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10041,
            name = "gyarados-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10041.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10042,
            name = "aerodactyl-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10042.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10043,
            name = "mewtwo-mega-x",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10043.png",
            types = listOf(Type(name = "psychic"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10044,
            name = "mewtwo-mega-y",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10044.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10045,
            name = "ampharos-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10045.png",
            types = listOf(Type(name = "electric"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10046,
            name = "scizor-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10046.png",
            types = listOf(Type(name = "bug"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10047,
            name = "heracross-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10047.png",
            types = listOf(Type(name = "bug"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10048,
            name = "houndoom-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10048.png",
            types = listOf(Type(name = "dark"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10049,
            name = "tyranitar-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10049.png",
            types = listOf(Type(name = "rock"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10050,
            name = "blaziken-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10050.png",
            types = listOf(Type(name = "fire"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10051,
            name = "gardevoir-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10051.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10052,
            name = "mawile-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10052.png",
            types = listOf(Type(name = "steel"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10053,
            name = "aggron-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10053.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 10054,
            name = "medicham-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10054.png",
            types = listOf(Type(name = "fighting"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10055,
            name = "manectric-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10055.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10056,
            name = "banette-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10056.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 10057,
            name = "absol-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10057.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 10058,
            name = "garchomp-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10058.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10059,
            name = "lucario-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10059.png",
            types = listOf(Type(name = "fighting"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10060,
            name = "abomasnow-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10060.png",
            types = listOf(Type(name = "grass"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10061,
            name = "floette-eternal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10061.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 10062,
            name = "latias-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10062.png",
            types = listOf(Type(name = "dragon"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10063,
            name = "latios-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10063.png",
            types = listOf(Type(name = "dragon"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10064,
            name = "swampert-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10064.png",
            types = listOf(Type(name = "water"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10065,
            name = "sceptile-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10065.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10066,
            name = "sableye-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10066.png",
            types = listOf(Type(name = "dark"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10067,
            name = "altaria-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10067.png",
            types = listOf(Type(name = "dragon"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10068,
            name = "gallade-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10068.png",
            types = listOf(Type(name = "psychic"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10069,
            name = "audino-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10069.png",
            types = listOf(Type(name = "normal"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10070,
            name = "sharpedo-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10070.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10071,
            name = "slowbro-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10071.png",
            types = listOf(Type(name = "water"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10072,
            name = "steelix-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10072.png",
            types = listOf(Type(name = "steel"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10073,
            name = "pidgeot-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10073.png",
            types = listOf(Type(name = "normal"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10074,
            name = "glalie-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10074.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10075,
            name = "diancie-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10075.png",
            types = listOf(Type(name = "rock"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10076,
            name = "metagross-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10076.png",
            types = listOf(Type(name = "steel"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10077,
            name = "kyogre-primal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10077.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10078,
            name = "groudon-primal",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10078.png",
            types = listOf(Type(name = "ground"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10079,
            name = "rayquaza-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10079.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10080,
            name = "pikachu-rock-star",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10080.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10081,
            name = "pikachu-belle",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10081.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10082,
            name = "pikachu-pop-star",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10082.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10083,
            name = "pikachu-phd",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10083.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10084,
            name = "pikachu-libre",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10084.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10085,
            name = "pikachu-cosplay",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10085.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10086,
            name = "hoopa-unbound",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10086.png",
            types = listOf(Type(name = "psychic"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10087,
            name = "camerupt-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10087.png",
            types = listOf(Type(name = "fire"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10088,
            name = "lopunny-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10088.png",
            types = listOf(Type(name = "normal"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10089,
            name = "salamence-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10089.png",
            types = listOf(Type(name = "dragon"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10090,
            name = "beedrill-mega",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10090.png",
            types = listOf(Type(name = "bug"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10091,
            name = "rattata-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10091.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10092,
            name = "raticate-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10092.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10093,
            name = "raticate-totem-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10093.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10094,
            name = "pikachu-original-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10094.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10095,
            name = "pikachu-hoenn-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10095.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10096,
            name = "pikachu-sinnoh-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10096.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10097,
            name = "pikachu-unova-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10097.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10098,
            name = "pikachu-kalos-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10098.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10099,
            name = "pikachu-alola-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10099.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10100,
            name = "raichu-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10100.png",
            types = listOf(Type(name = "electric"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10101,
            name = "sandshrew-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10101.png",
            types = listOf(Type(name = "ice"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10102,
            name = "sandslash-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10102.png",
            types = listOf(Type(name = "ice"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10103,
            name = "vulpix-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10103.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10104,
            name = "ninetales-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10104.png",
            types = listOf(Type(name = "ice"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10105,
            name = "diglett-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10105.png",
            types = listOf(Type(name = "ground"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10106,
            name = "dugtrio-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10106.png",
            types = listOf(Type(name = "ground"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10107,
            name = "meowth-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10107.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 10108,
            name = "persian-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10108.png",
            types = listOf(Type(name = "dark"))
        ),
        Pokemon(
            id = 10109,
            name = "geodude-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10109.png",
            types = listOf(Type(name = "rock"), Type(name = "electric"))
        ),
        Pokemon(
            id = 10110,
            name = "graveler-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10110.png",
            types = listOf(Type(name = "rock"), Type(name = "electric"))
        ),
        Pokemon(
            id = 10111,
            name = "golem-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10111.png",
            types = listOf(Type(name = "rock"), Type(name = "electric"))
        ),
        Pokemon(
            id = 10112,
            name = "grimer-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10112.png",
            types = listOf(Type(name = "poison"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10113,
            name = "muk-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10113.png",
            types = listOf(Type(name = "poison"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10114,
            name = "exeggutor-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10114.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10115,
            name = "marowak-alola",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10115.png",
            types = listOf(Type(name = "fire"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10116,
            name = "greninja-battle-bond",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10116.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10117,
            name = "greninja-ash",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10117.png",
            types = listOf(Type(name = "water"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10118,
            name = "zygarde-10",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10118.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10119,
            name = "zygarde-50",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10119.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10120,
            name = "zygarde-complete",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10120.png",
            types = listOf(Type(name = "dragon"), Type(name = "ground"))
        ),
        Pokemon(
            id = 10121,
            name = "gumshoos-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10121.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 10122,
            name = "vikavolt-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10122.png",
            types = listOf(Type(name = "bug"), Type(name = "electric"))
        ),
        Pokemon(
            id = 10123,
            name = "oricorio-pom-pom",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10123.png",
            types = listOf(Type(name = "electric"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10124,
            name = "oricorio-pau",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10124.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10125,
            name = "oricorio-sensu",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10125.png",
            types = listOf(Type(name = "ghost"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10126,
            name = "lycanroc-midnight",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10126.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 10127,
            name = "wishiwashi-school",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10127.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10128,
            name = "lurantis-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10128.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 10129,
            name = "salazzle-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10129.png",
            types = listOf(Type(name = "poison"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10130,
            name = "minior-orange-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10130.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10131,
            name = "minior-yellow-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10131.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10132,
            name = "minior-green-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10132.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10133,
            name = "minior-blue-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10133.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10134,
            name = "minior-indigo-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10134.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10135,
            name = "minior-violet-meteor",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10135.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10136,
            name = "minior-red",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10136.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10137,
            name = "minior-orange",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10137.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10138,
            name = "minior-yellow",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10138.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10139,
            name = "minior-green",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10139.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10140,
            name = "minior-blue",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10140.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10141,
            name = "minior-indigo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10141.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10142,
            name = "minior-violet",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10142.png",
            types = listOf(Type(name = "rock"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10143,
            name = "mimikyu-busted",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10143.png",
            types = listOf(Type(name = "ghost"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10144,
            name = "mimikyu-totem-disguised",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10144.png",
            types = listOf(Type(name = "ghost"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10145,
            name = "mimikyu-totem-busted",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10145.png",
            types = listOf(Type(name = "ghost"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10146,
            name = "kommo-o-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10146.png",
            types = listOf(Type(name = "dragon"), Type(name = "fighting"))
        ),
        Pokemon(
            id = 10147,
            name = "magearna-original",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10147.png",
            types = listOf(Type(name = "steel"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10148,
            name = "pikachu-partner-cap",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10148.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10149,
            name = "marowak-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10149.png",
            types = listOf(Type(name = "fire"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10150,
            name = "ribombee-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10150.png",
            types = listOf(Type(name = "bug"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10151,
            name = "rockruff-own-tempo",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10151.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 10152,
            name = "lycanroc-dusk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10152.png",
            types = listOf(Type(name = "rock"))
        ),
        Pokemon(
            id = 10153,
            name = "araquanid-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10153.png",
            types = listOf(Type(name = "water"), Type(name = "bug"))
        ),
        Pokemon(
            id = 10154,
            name = "togedemaru-totem",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10154.png",
            types = listOf(Type(name = "electric"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10155,
            name = "necrozma-dusk",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10155.png",
            types = listOf(Type(name = "psychic"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10156,
            name = "necrozma-dawn",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10156.png",
            types = listOf(Type(name = "psychic"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10157,
            name = "necrozma-ultra",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10157.png",
            types = listOf(Type(name = "psychic"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10158,
            name = "meowth-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10158.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 10159,
            name = "ponyta-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10159.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10160,
            name = "rapidash-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10160.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10161,
            name = "slowpoke-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10161.png",
            types = listOf(Type(name = "psychic"))
        ),
        Pokemon(
            id = 10162,
            name = "slowbro-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10162.png",
            types = listOf(Type(name = "poison"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10163,
            name = "farfetchd-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10163.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 10164,
            name = "weezing-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10164.png",
            types = listOf(Type(name = "poison"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10165,
            name = "mr-mime-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10165.png",
            types = listOf(Type(name = "ice"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10166,
            name = "articuno-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10166.png",
            types = listOf(Type(name = "psychic"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10167,
            name = "zapdos-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10167.png",
            types = listOf(Type(name = "fighting"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10168,
            name = "moltres-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10168.png",
            types = listOf(Type(name = "dark"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10169,
            name = "slowking-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10169.png",
            types = listOf(Type(name = "poison"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10170,
            name = "corsola-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10170.png",
            types = listOf(Type(name = "ghost"))
        ),
        Pokemon(
            id = 10171,
            name = "zigzagoon-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10171.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10172,
            name = "linoone-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10172.png",
            types = listOf(Type(name = "dark"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10173,
            name = "darumaka-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10173.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10174,
            name = "darmanitan-standard-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10174.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10175,
            name = "darmanitan-zen-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10175.png",
            types = listOf(Type(name = "ice"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10176,
            name = "yamask-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10176.png",
            types = listOf(Type(name = "ground"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10177,
            name = "stunfisk-galar",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10177.png",
            types = listOf(Type(name = "ground"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10178,
            name = "toxtricity-low-key",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10178.png",
            types = listOf(Type(name = "electric"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10179,
            name = "eiscue-noice",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10179.png",
            types = listOf(Type(name = "ice"))
        ),
        Pokemon(
            id = 10180,
            name = "indeedee-female",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10180.png",
            types = listOf(Type(name = "psychic"), Type(name = "normal"))
        ),
        Pokemon(
            id = 10181,
            name = "zacian-crowned",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10181.png",
            types = listOf(Type(name = "fairy"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10182,
            name = "zamazenta-crowned",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10182.png",
            types = listOf(Type(name = "fighting"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10183,
            name = "urshifu-rapid-strike",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10183.png",
            types = listOf(Type(name = "fighting"), Type(name = "water"))
        ),
        Pokemon(
            id = 10184,
            name = "calyrex-ice-rider",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10184.png",
            types = listOf(Type(name = "psychic"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10185,
            name = "calyrex-shadow-rider",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10185.png",
            types = listOf(Type(name = "psychic"), Type(name = "ghost"))
        ),
        Pokemon(
            id = 10186,
            name = "venusaur-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10186.png",
            types = listOf(Type(name = "grass"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10187,
            name = "charizard-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10187.png",
            types = listOf(Type(name = "fire"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10188,
            name = "blastoise-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10188.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10189,
            name = "butterfree-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10189.png",
            types = listOf(Type(name = "bug"), Type(name = "flying"))
        ),
        Pokemon(
            id = 10190,
            name = "pikachu-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10190.png",
            types = listOf(Type(name = "electric"))
        ),
        Pokemon(
            id = 10191,
            name = "meowth-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10191.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 10192,
            name = "machamp-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10192.png",
            types = listOf(Type(name = "fighting"))
        ),
        Pokemon(
            id = 10193,
            name = "gengar-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10193.png",
            types = listOf(Type(name = "ghost"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10194,
            name = "kingler-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10194.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10195,
            name = "lapras-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10195.png",
            types = listOf(Type(name = "water"), Type(name = "ice"))
        ),
        Pokemon(
            id = 10196,
            name = "eevee-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10196.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 10197,
            name = "snorlax-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10197.png",
            types = listOf(Type(name = "normal"))
        ),
        Pokemon(
            id = 10198,
            name = "garbodor-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10198.png",
            types = listOf(Type(name = "poison"))
        ),
        Pokemon(
            id = 10199,
            name = "melmetal-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10199.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 10200,
            name = "rillaboom-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10200.png",
            types = listOf(Type(name = "grass"))
        ),
        Pokemon(
            id = 10201,
            name = "cinderace-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10201.png",
            types = listOf(Type(name = "fire"))
        ),
        Pokemon(
            id = 10202,
            name = "inteleon-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10202.png",
            types = listOf(Type(name = "water"))
        ),
        Pokemon(
            id = 10203,
            name = "corviknight-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10203.png",
            types = listOf(Type(name = "flying"), Type(name = "steel"))
        ),
        Pokemon(
            id = 10204,
            name = "orbeetle-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10204.png",
            types = listOf(Type(name = "bug"), Type(name = "psychic"))
        ),
        Pokemon(
            id = 10205,
            name = "drednaw-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10205.png",
            types = listOf(Type(name = "water"), Type(name = "rock"))
        ),
        Pokemon(
            id = 10206,
            name = "coalossal-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10206.png",
            types = listOf(Type(name = "rock"), Type(name = "fire"))
        ),
        Pokemon(
            id = 10207,
            name = "flapple-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10207.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10208,
            name = "appletun-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10208.png",
            types = listOf(Type(name = "grass"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10209,
            name = "sandaconda-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10209.png",
            types = listOf(Type(name = "ground"))
        ),
        Pokemon(
            id = 10210,
            name = "toxtricity-amped-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10210.png",
            types = listOf(Type(name = "electric"), Type(name = "poison"))
        ),
        Pokemon(
            id = 10211,
            name = "centiskorch-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10211.png",
            types = listOf(Type(name = "fire"), Type(name = "bug"))
        ),
        Pokemon(
            id = 10212,
            name = "hatterene-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10212.png",
            types = listOf(Type(name = "psychic"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10213,
            name = "grimmsnarl-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10213.png",
            types = listOf(Type(name = "dark"), Type(name = "fairy"))
        ),
        Pokemon(
            id = 10214,
            name = "alcremie-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10214.png",
            types = listOf(Type(name = "fairy"))
        ),
        Pokemon(
            id = 10215,
            name = "copperajah-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10215.png",
            types = listOf(Type(name = "steel"))
        ),
        Pokemon(
            id = 10216,
            name = "duraludon-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10216.png",
            types = listOf(Type(name = "steel"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10217,
            name = "eternatus-eternamax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10217.png",
            types = listOf(Type(name = "poison"), Type(name = "dragon"))
        ),
        Pokemon(
            id = 10218,
            name = "urshifu-single-strike-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10218.png",
            types = listOf(Type(name = "fighting"), Type(name = "dark"))
        ),
        Pokemon(
            id = 10219,
            name = "urshifu-rapid-strike-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10219.png",
            types = listOf(Type(name = "fighting"), Type(name = "water"))
        ),
        Pokemon(
            id = 10220,
            name = "toxtricity-low-key-gmax",
            imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10220.png",
            types = listOf(Type(name = "electric"), Type(name = "poison"))
        ),
    )

}