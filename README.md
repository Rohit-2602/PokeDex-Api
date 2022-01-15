## PokeDex Api
PokeDexApi is a simple version of [PokeApi](https://pokeapi.co/) with search functionality based on KTOR.

## Documentation

#### Base Url
https://poki-dex.herokuapp.com

#### EndPoints
- [/pokemons](https://github.com/Rohit-2602/PokeDex-Api/new/master?readme=1#pokemons)
- [/pokemons/search](https://github.com/Rohit-2602/PokeDex-Api/new/master?readme=1#pokemonssearch)
- [/pokemons/detail](https://github.com/Rohit-2602/PokeDex-Api/new/master?readme=1#pokemonsdetail)

## /pokemons
Return List of all the Pokemons

#### Expected query Parameters
> page
```xml
Use this to page through the results if the total results found is greater than the page size. Default value is 1.
```
> pageSize
```xml
The number of results to return per page. Default value is 10.
```

#### Example
https://poki-dex.herokuapp.com/pokemons?page=2&pageSize=30
> Response
```xml
data class AllPokemonResponse(
    val success: Boolean,
    val total: Int,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val pokemons: List<Pokemon>
)
```
> Pokemon
```xml
data class Pokemon(
    val id: Int, 
    val name: String, 
    val imageUrl: String,
    val types: List<Type>
)

// Type
data class Type(
    val name: String
)
```

## /pokemons/search
Return List of Pokemons based on search query.

#### Expected query Parameters
> name
```xml
Pass a text query to search for a pokemon. Default value is ""
```
> page
```xml
Use this to page through the results if the total results found is greater than the page size. Default value is 1.
```
> pageSize
```xml
The number of results to return per page. Default value is 20.
```

#### Example
https://poki-dex.herokuapp.com/pokemons/search?name=ch&page=1&pageSize=20
> Response
```xml
data class SearchResponse(
    val success: Boolean,
    val message: String,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val pokemons: List<Pokemon>
)
```

## /pokemons/detail
Return Single Pokemon Details based on its id.

#### Expected query Parameters
> id
```xml
Use this to get the result for particular passed id. Default value is 1.
```

#### Example
https://poki-dex.herokuapp.com/pokemons/detail?id=2
> Response
```xml
data class PokemonDetailResponse(
    val success: Boolean,
    val message: String? = null,
    val pokemon: PokemonDetail?=null
)
```
> PokemonDetail
```xml
data class PokemonDetail(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val weight: Int,
    val height: Int,
    val abilities: List<Ability>,
    val stats: List<Stat>,
    val types: List<Type>
)

// Ability
data class Ability(
    val name: String
)

// Stat
data class Stat(
    val name: String,
    val base_stat: Int
)

// Type
data class Type(
    val name: String
)
```

