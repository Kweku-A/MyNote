package com.kweku.armah.mynote.domain.repository

import com.kweku.armah.mynote.domain.model.MyNote
import kotlinx.coroutines.flow.Flow

interface MyNoteRepository {
    suspend fun addNote(myNote: MyNote)
    suspend fun updateNote(myNote: MyNote)
    suspend fun deleteNote(myNote: MyNote)
    fun getAllNotes(): Flow<List<MyNote>>
    fun getNoteWithId(id: Int): Flow<MyNote>
}