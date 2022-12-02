package com.kweku.armah.feature2presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kweku.armah.feature2domain.model.MyNote
import com.kweku.armah.feature2presentation.ui.navigation.NavRoutes2
import com.kweku.armah.feature2presentation.viewmodel.MyNoteViewModel

// It is good to split the navigation graph just as you split the screen,
// using the following approach
@OptIn(ExperimentalLifecycleComposeApi::class)
fun NavGraphBuilder.navigateToMyNoteListScreen2(navigateToScreen: (String) -> Unit) {
    composable(NavRoutes2.ListScreen.route) {
        val viewModel: MyNoteViewModel = hiltViewModel()
        val myNoteListScreenUIState2: MyNoteListScreenUIState2 by viewModel.noteList.collectAsStateWithLifecycle()

        MyNoteListScreen(
            myNoteListScreenUIState2 = myNoteListScreenUIState2,
            navigateTo = navigateToScreen
        )
    }
}

@Composable
fun MyNoteListScreen(
    myNoteListScreenUIState2: MyNoteListScreenUIState2,
    navigateTo: (String) -> Unit
) {
    when (myNoteListScreenUIState2) {
        MyNoteListScreenUIState2.Loading -> {
            // Showing loading screen
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        is MyNoteListScreenUIState2.Success -> {
            Box(modifier = Modifier.fillMaxWidth()) {
                ListMyNoteItems(myNoteListScreenUIState2)
            }
        }

        is MyNoteListScreenUIState2.Failure -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Failure fetching data!")
            }
        }
    }
}

@Composable
private fun ListMyNoteItems(myNoteListScreenUIState2: MyNoteListScreenUIState2.Success) {
//    val list = myNoteListScreenUIState.body
    val list = listOf(
        MyNote(id = 1, "Title1", date = "Date1", content = "content is here"),
        MyNote(id = 2, "Title2", date = "Date2", content = "content2 is here"),
        MyNote(id = 3, "Title3", date = "Date3", content = "content3 is here")
    )

    val modifier = Modifier.fillMaxSize()

    LazyColumn(modifier = modifier) {
        items(list) { myNote ->
            Column(modifier = modifier.padding(5.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = myNote.title)
                    Text(text = myNote.date)
                }
                Text(text = myNote.content)
            }
        }
    }
}
