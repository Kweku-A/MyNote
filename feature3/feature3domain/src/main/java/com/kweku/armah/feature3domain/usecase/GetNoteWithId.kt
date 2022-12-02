package com.kweku.armah.feature3domain.usecase

import com.kweku.armah.feature3domain.repository.MyNoteRepository

class GetNoteWithId constructor(private val repository: MyNoteRepository) {

    operator fun invoke(id: Int) = repository.getNoteWithId(id = id)
}
