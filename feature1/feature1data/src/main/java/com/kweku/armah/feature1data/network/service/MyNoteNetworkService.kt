package com.kweku.armah.feature1data.network.service

import com.kweku.armah.feature1data.network.dto.MyNoteDto

interface MyNoteNetworkService {
    suspend fun getSomeNote(): MyNoteDto
    suspend fun getAllNotes(): List<MyNoteDto>
}
