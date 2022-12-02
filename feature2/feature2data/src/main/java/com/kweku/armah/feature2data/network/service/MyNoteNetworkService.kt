package com.kweku.armah.feature2data.network.service

import com.kweku.armah.feature2data.network.dto.MyNoteDto

interface MyNoteNetworkService {
    suspend fun getSomeNote(): MyNoteDto
    suspend fun getAllNotes(): List<MyNoteDto>
}
