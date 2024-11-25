package com.example.rickandmortycompose.data.repository

import com.example.rickandmortycompose.data.model.CharacterResponse
import com.example.rickandmortycompose.data.network.api.CharacterApi

class CharacterRepository(
    private val characterApi: CharacterApi
) {

    suspend fun getAllCharacters(): List<CharacterResponse>? {
        return try {
            val response = characterApi.getAllCharacters()
            if (response.isSuccessful) {
                response.body()?.characterResponse
            } else {
                return null
            }
        } catch (ex: Exception) {
            null
        }
    }

    suspend fun getSingleCharacter(id: Int): CharacterResponse? {
        return try {
            val response = characterApi.getSingleCharacter(id)
            if (response.isSuccessful) {
                val character = response.body()
                return character
            } else {
                return null
            }
        } catch (ex: Exception) {
            null
        }
    }
}
