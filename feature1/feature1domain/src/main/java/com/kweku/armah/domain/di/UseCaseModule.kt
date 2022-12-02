package com.kweku.armah.domain.di

import com.kweku.armah.domain.usecase.AddMyNote
import com.kweku.armah.domain.usecase.DeleteMyNote
import com.kweku.armah.domain.usecase.GetAllNotes
import com.kweku.armah.domain.usecase.GetNoteWithId
import com.kweku.armah.domain.usecase.UpdateMyNote
import com.kweku.armah.mynote.domain.usecase.MyNoteUsecases

object UseCaseModule {

    fun provideUseCases(
        addMyNote: AddMyNote,
        updateMyNote: UpdateMyNote,
        deleteMyNote: DeleteMyNote,
        getAllNotes: GetAllNotes,
        getNoteWithId: GetNoteWithId
    ) = MyNoteUsecases(
        addMyNote = addMyNote,
        updateMyNote = updateMyNote,
        deleteMyNote = deleteMyNote,
        getAllNotes = getAllNotes,
        getNoteWithId = getNoteWithId
    )
}
