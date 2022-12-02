package com.kweku.armah.presentation.ui.screens

import com.kweku.armah.domain.model.MyNote

sealed class MyNoteListScreenUIState {
    data class Success(val body: List<MyNote>) : MyNoteListScreenUIState()
    data class Failure(val errorMessage: String) : MyNoteListScreenUIState()
    object Loading : MyNoteListScreenUIState()
}
