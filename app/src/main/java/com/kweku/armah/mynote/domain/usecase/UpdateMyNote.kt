package com.kweku.armah.mynote.domain.usecase

import com.kweku.armah.mynote.domain.model.MyNote
import com.kweku.armah.mynote.domain.repository.MyNoteRepository
import javax.inject.Inject

class UpdateMyNote @Inject constructor(private val repository: MyNoteRepository) {

    suspend operator fun invoke(note: MyNote) = repository.updateNote(myNote = note)
}