package com.kweku.armah.domain.usecase

import com.kweku.armah.domain.model.MyNote
import com.kweku.armah.domain.repository.MyNoteRepository

class AddMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.addNote(myNote = note)
}