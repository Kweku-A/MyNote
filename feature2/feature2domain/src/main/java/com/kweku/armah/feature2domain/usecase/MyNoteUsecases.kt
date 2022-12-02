package com.kweku.armah.feature2domain.usecase

data class MyNoteUsecases(
    val addMyNote: AddMyNote,
    val updateMyNote: UpdateMyNote,
    val deleteMyNote: DeleteMyNote,
    val getAllNotes: GetAllNotes,
    val getNoteWithId: GetNoteWithId
)
