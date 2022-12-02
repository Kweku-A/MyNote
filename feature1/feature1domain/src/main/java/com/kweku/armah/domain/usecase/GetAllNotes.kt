package com.kweku.armah.domain.usecase

import com.kweku.armah.domain.repository.MyNoteRepository

class GetAllNotes constructor(private val repository: MyNoteRepository) {

    operator fun invoke() = repository.getAllNotes()
}
