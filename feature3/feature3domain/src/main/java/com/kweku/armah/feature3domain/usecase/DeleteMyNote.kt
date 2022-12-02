package com.kweku.armah.feature3domain.usecase

import com.kweku.armah.feature3domain.model.MyNote
import com.kweku.armah.feature3domain.repository.MyNoteRepository

class DeleteMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.deleteNote(myNote = note)
}
