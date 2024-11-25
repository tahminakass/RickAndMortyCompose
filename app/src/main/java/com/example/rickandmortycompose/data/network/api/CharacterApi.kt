package com.example.rickandmortycompose.data.network.api

import com.example.rickandmortycompose.data.model.CharacterResponse
import com.example.rickandmortycompose.data.model.CharactersResultsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterApi {

    @GET("character")
    suspend fun getAllCharacters(): Response<CharactersResultsResponse>

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id : Int) : Response<CharacterResponse>
}