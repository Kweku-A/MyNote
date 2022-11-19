package com.kweku.armah.mynote.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kweku.armah.mynote.domain.usecase.MyNoteUsecases
import com.kweku.armah.mynote.presentation.ui.screens.MyNoteListScreenUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyNoteViewModel @Inject constructor(
    private val usecases: MyNoteUsecases,
    private val coroutineDispatcher: CoroutineDispatcher
) : ViewModel() {

    private val _noteList: MutableStateFlow<MyNoteListScreenUIState> = MutableStateFlow(
        MyNoteListScreenUIState.Loading
    )
    val noteList = _noteList.asStateFlow()

    private fun getListOfNotes() {
        _noteList.value = MyNoteListScreenUIState.Loading
        viewModelScope.launch(coroutineDispatcher) {
            delay(3000) // added to allow progress indicator to show
            usecases.getAllNotes().collectLatest {
                _noteList.value = MyNoteListScreenUIState.Success(it)
            }
        }
    }

    init {
        getListOfNotes()
    }
}
