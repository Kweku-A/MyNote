package com.kweku.armah.feature2presentation.ui.screens

import com.kweku.armah.feature2domain.model.MyNote

sealed class MyNoteListScreenUIState2 {
    data class Success(val body: List<MyNote>) : MyNoteListScreenUIState2()
    data class Failure(val errorMessage: String) : MyNoteListScreenUIState2()
    object Loading : MyNoteListScreenUIState2()
}
