package com.kweku.armah.domain.usecase

import com.kweku.armah.domain.model.MyNote
import com.kweku.armah.domain.repository.MyNoteRepository

class DeleteMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.deleteNote(myNote = note)
}
