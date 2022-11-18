package com.kweku.armah.mynote.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kweku.armah.mynote.data.database.entity.MyNoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MyNoteEntityDao {

    @Insert
    fun insertNoteEntity(myNoteEntity: MyNoteEntity)

    @Update
    fun updateNoteEntity(myNoteEntity: MyNoteEntity)

    @Delete
    fun deleteNoteEntity(myNoteEntity: MyNoteEntity)

    @Query("Select * From note_tb")
    fun getAllNotes(): Flow<List<MyNoteEntity>>

    @Query("Select * From note_tb Where id=:id")
    fun getNote(id: Int): Flow<MyNoteEntity>
}