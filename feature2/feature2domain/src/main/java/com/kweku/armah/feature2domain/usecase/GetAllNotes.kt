package com.kweku.armah.feature2domain.usecase

import com.kweku.armah.feature2domain.repository.MyNoteRepository

class GetAllNotes constructor(private val repository: MyNoteRepository) {

    operator fun invoke() = repository.getAllNotes()
}
