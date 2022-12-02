package com.kweku.armah.feature2domain.usecase

import com.kweku.armah.feature2domain.model.MyNote
import com.kweku.armah.feature2domain.repository.MyNoteRepository

class UpdateMyNote constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.updateNote(myNote = note)
}
