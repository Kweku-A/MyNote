package com.kweku.armah.mynote.domain.usecase

import com.kweku.armah.domain.usecase.AddMyNote
import com.kweku.armah.domain.usecase.DeleteMyNote
import com.kweku.armah.domain.usecase.GetAllNotes
import com.kweku.armah.domain.usecase.GetNoteWithId
import com.kweku.armah.domain.usecase.UpdateMyNote

data class MyNoteUsecases(
    val addMyNote: AddMyNote,
    val updateMyNote: UpdateMyNote,
    val deleteMyNote: DeleteMyNote,
    val getAllNotes: GetAllNotes,
    val getNoteWithId: GetNoteWithId
)
