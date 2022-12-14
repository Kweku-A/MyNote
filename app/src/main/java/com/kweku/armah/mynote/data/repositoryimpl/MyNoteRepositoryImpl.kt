package com.kweku.armah.mynote.data.repositoryimpl

import com.kweku.armah.mynote.data.database.dao.MyNoteEntityDao
import com.kweku.armah.mynote.data.database.entity.MyNoteEntity
import com.kweku.armah.mynote.domain.model.MyNote
import com.kweku.armah.mynote.domain.repository.MyNoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MyNoteRepositoryImpl @Inject constructor(private val myNoteEntityDao: MyNoteEntityDao) :
    MyNoteRepository {
    override suspend fun addNote(myNote: MyNote) {
        val noteEntity = with(myNote) {
            MyNoteEntity(
                id = this.id,
                title = this.title,
                date = this.date,
                content = this.content
            )
        }
        myNoteEntityDao.insertNoteEntity(noteEntity)
    }

    override suspend fun updateNote(myNote: MyNote) {
        val noteEntity = with(myNote) {
            MyNoteEntity(
                id = this.id,
                title = this.title,
                date = this.date,
                content = this.content
            )
        }
        myNoteEntityDao.updateNoteEntity(noteEntity)
    }

    override suspend fun deleteNote(myNote: MyNote) {
        val noteEntity = with(myNote) {
            MyNoteEntity(
                id = this.id,
                title = this.title,
                date = this.date,
                content = this.content
            )
        }
        myNoteEntityDao.deleteNoteEntity(noteEntity)
    }

    override fun getAllNotes(): Flow<List<MyNote>> {
        return myNoteEntityDao.getAllNotes().map { entities ->
            entities.map {
                MyNote(
                    id = it.id,
                    title = it.title,
                    date = it.date,
                    content = it.content
                )
            }
        }
    }

    override fun getNoteWithId(id: Int): Flow<MyNote> {
        return myNoteEntityDao.getNote(id).map {
            MyNote(
                id = it.id,
                title = it.title,
                date = it.date,
                content = it.content
            )
        }
    }
}