package com.kweku.armah.domain.usecase

import com.kweku.armah.domain.repository.MyNoteRepository

class GetNoteWithId constructor(private val repository: MyNoteRepository) {

    operator fun invoke(id: Int) = repository.getNoteWithId(id = id)
}
