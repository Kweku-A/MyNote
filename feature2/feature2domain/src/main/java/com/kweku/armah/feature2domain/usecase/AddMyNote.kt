package com.kweku.armah.feature2domain.usecase

import com.kweku.armah.feature2domain.model.MyNote
import com.kweku.armah.feature2domain.repository.MyNoteRepository

class AddMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.addNote(myNote = note)
}
