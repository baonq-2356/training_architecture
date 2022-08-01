package com.baonq.training_architecture.data.remote.api.character

import com.baonq.training_architecture.data.remote.api.BaseRemoteDataSource
import javax.inject.Inject

class CharacterRemoteDataSource @Inject constructor(
    private val characterService: CharacterService
): BaseRemoteDataSource() {

    suspend fun getCharacters() = getResult { characterService.getAllCharacters() }
    suspend fun getCharacter(id: Int) = getResult { characterService.getCharacter(id) }
}
