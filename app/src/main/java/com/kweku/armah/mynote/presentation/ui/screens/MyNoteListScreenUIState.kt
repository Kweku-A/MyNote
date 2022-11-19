package com.kweku.armah.mynote.presentation.ui.screens

import com.kweku.armah.mynote.domain.model.MyNote

sealed class MyNoteListScreenUIState {
    data class Success(val body: List<MyNote>) : MyNoteListScreenUIState()
    data class Failure(val errorMessage: String) : MyNoteListScreenUIState()
    object Loading : MyNoteListScreenUIState()
}
