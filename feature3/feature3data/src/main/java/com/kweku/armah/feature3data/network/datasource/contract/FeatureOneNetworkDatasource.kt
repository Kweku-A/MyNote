package com.kweku.armah.feature3data.network.datasource.contract

import com.kweku.armah.feature3data.network.dto.MyNoteDto
import com.kweku.armah.networkresult.ApiResult

interface FeatureOneNetworkDatasource {
    suspend fun getSomeNote(): ApiResult<MyNoteDto>
    suspend fun getAllNotes(): ApiResult<MyNoteDto>
}
