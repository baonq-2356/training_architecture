package com.baonq.training_architecture.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters_person")
data class CharacterPerson(
    val created: String,
    val gender: String,
    @PrimaryKey
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
