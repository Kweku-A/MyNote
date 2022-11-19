package com.kweku.armah.mynote.presentation.ui.navigation

sealed class NavRoutes(val route: String) {
    object ListScreen : NavRoutes("list_screen")
    object NoteScreen : NavRoutes("note_screen")
}
