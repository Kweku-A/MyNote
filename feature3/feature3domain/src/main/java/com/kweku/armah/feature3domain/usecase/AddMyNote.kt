package com.kweku.armah.feature3domain.usecase

import com.kweku.armah.feature3domain.model.MyNote
import com.kweku.armah.feature3domain.repository.MyNoteRepository

class AddMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.addNote(myNote = note)
}
