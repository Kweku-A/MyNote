package com.kweku.armah.feature2domain.usecase

import com.kweku.armah.feature2domain.model.MyNote
import com.kweku.armah.feature2domain.repository.MyNoteRepository

class DeleteMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.deleteNote(myNote = note)
}
