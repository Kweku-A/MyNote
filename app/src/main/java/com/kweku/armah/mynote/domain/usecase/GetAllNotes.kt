package com.kweku.armah.mynote.domain.usecase

import com.kweku.armah.mynote.domain.repository.MyNoteRepository
import javax.inject.Inject

class GetAllNotes @Inject constructor(private val repository: MyNoteRepository) {

    operator fun invoke() = repository.getAllNotes()
}