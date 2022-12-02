package com.kweku.armah.feature2presentation.ui.navigation

sealed class NavRoutes2(val route: String) {
    object ListScreen : NavRoutes2("list_screen")
    object NoteScreen : NavRoutes2("note_screen")
}
