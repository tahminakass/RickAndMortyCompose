package com.example.rickandmortycompose.data.network.api

import com.example.rickandmortycompose.data.model.CharacterResponse
import com.example.rickandmortycompose.data.model.CharacterResultsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApi {

    @GET("character")
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ):CharacterResultsResponse

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id: Int): Response<CharacterResponse>
}