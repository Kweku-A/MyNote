package com.kweku.armah.feature3domain.usecase

import com.kweku.armah.feature3domain.repository.MyNoteRepository

class GetAllNotes constructor(private val repository: MyNoteRepository) {

    operator fun invoke() = repository.getAllNotes()
}
