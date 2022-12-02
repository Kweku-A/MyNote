package com.kweku.armah.feature3data.network.service

import com.kweku.armah.feature3data.network.dto.MyNoteDto

interface MyNoteNetworkService {
    suspend fun getSomeNote(): MyNoteDto
    suspend fun getAllNotes(): List<MyNoteDto>
}
