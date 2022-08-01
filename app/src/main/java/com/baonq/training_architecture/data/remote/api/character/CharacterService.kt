package com.baonq.training_architecture.data.remote.api.character

import com.baonq.training_architecture.data.entities.CharacterPerson
import com.baonq.training_architecture.data.entities.CharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<CharacterPerson>
}
