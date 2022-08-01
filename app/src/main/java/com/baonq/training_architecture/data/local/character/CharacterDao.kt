package com.baonq.training_architecture.data.local.character

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.baonq.training_architecture.data.entities.CharacterPerson

@Dao
interface CharacterDao {
    @Query("SELECT * FROM characters")
    fun getAllCharacters() : LiveData<List<CharacterPerson>>

    @Query("SELECT * FROM characters WHERE id = :id")
    fun getCharacter(id: Int): LiveData<CharacterPerson>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characterPeople: List<CharacterPerson>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterPerson: CharacterPerson)
}
