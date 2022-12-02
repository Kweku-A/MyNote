package com.kweku.armah.presentation.ui.navigation

sealed class NavRoutes(val route: String) {
    object ListScreen : NavRoutes("list_screen")
    object NoteScreen : NavRoutes("note_screen")
}
