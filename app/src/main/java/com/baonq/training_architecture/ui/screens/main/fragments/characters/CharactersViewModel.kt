package com.baonq.training_architecture.ui.screens.main.fragments.characters

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.baonq.training_architecture.data.entities.Character
import com.baonq.training_architecture.data.repository.character.CharacterRepository
import com.baonq.training_architecture.utils.Resource

class CharactersViewModel @ViewModelInject constructor(
    private val characterRepository: CharacterRepository
): ViewModel() {

    val characters: LiveData<Resource<List<Character>>> = characterRepository.getCharacters()
}
