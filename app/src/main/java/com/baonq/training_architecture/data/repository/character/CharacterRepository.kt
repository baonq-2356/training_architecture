package com.baonq.training_architecture.data.repository.character

import androidx.lifecycle.LiveData
import com.baonq.training_architecture.data.entities.Character
import com.baonq.training_architecture.utils.Resource

interface CharacterRepository {
    fun getCharacter(id: Int): LiveData<Resource<Character>>
    fun getCharacters(): LiveData<Resource<List<Character>>>
}
