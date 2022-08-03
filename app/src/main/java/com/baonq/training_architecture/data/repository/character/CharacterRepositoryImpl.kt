package com.baonq.training_architecture.data.repository.character

import com.baonq.training_architecture.data.local.character.CharacterDao
import com.baonq.training_architecture.data.remote.api.character.CharacterRemoteDataSource
import com.baonq.training_architecture.utils.performGetOperation
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharacterRepositoryImpl @Inject constructor(
    private val characterLocalDataSource: CharacterDao,
    private val characterRemoteDataSource: CharacterRemoteDataSource
) : CharacterRepository {

    override fun getCharacter(id: Int) = performGetOperation(
        databaseQuery = { characterLocalDataSource.getCharacter(id) },
        networkCall = { characterRemoteDataSource.getCharacter(id) },
        saveCallResult = { characterLocalDataSource.insert(it) }
    )


    override fun getCharacters() = performGetOperation(
        databaseQuery = { characterLocalDataSource.getAllCharacters() },
        networkCall = { characterRemoteDataSource.getCharacters() },
        saveCallResult = { characterLocalDataSource.insertAll(it.results) }
    )
}
