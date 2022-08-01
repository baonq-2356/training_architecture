package com.baonq.training_architecture.ui.screens.main.fragments.characters

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.baonq.training_architecture.data.entities.CharacterPerson
import com.baonq.training_architecture.data.repository.character.CharacterRepository
import com.baonq.training_architecture.utils.Resource
//import dagger.hilt.android.lifecycle.HiltViewModel

//@HiltViewModel
class CharactersViewModel @ViewModelInject constructor(
    private val characterRepository: CharacterRepository
): ViewModel() {

    val characters: LiveData<Resource<List<CharacterPerson>>> = characterRepository.getCharacters()
}
