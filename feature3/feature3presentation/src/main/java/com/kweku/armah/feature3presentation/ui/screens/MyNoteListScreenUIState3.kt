package com.kweku.armah.feature3presentation.ui.screens

import com.kweku.armah.feature3domain.model.MyNote

sealed class MyNoteListScreenUIState3 {
    data class Success(val body: List<MyNote>) : MyNoteListScreenUIState3()
    data class Failure(val errorMessage: String) : MyNoteListScreenUIState3()
    object Loading : MyNoteListScreenUIState3()
}
