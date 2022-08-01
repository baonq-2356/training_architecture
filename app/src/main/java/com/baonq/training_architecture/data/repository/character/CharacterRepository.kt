package com.baonq.training_architecture.data.repository.character

import androidx.lifecycle.LiveData
import com.baonq.training_architecture.data.entities.CharacterPerson
import com.baonq.training_architecture.utils.Resource

interface CharacterRepository {
    fun getCharacter(id: Int): LiveData<Resource<CharacterPerson>>
    fun getCharacters(): LiveData<Resource<List<CharacterPerson>>>
}
