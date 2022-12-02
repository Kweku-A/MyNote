package com.kweku.armah.domain.repository

import com.kweku.armah.domain.model.MyNote
import kotlinx.coroutines.flow.Flow

interface MyNoteRepository {
    suspend fun addNote(myNote: MyNote)
    suspend fun updateNote(myNote: MyNote)
    suspend fun deleteNote(myNote: MyNote)

    @Throws(Exception::class)
    fun getAllNotes(): Flow<List<MyNote>>

    @Throws(Exception::class)
    fun getNoteWithId(id: Int): Flow<MyNote>
}