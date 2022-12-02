package com.kweku.armah.feature3presentation.ui.navigation

sealed class NavRoutes3(val route: String) {
    object ListScreen : NavRoutes3("list_screen")
    object NoteScreen : NavRoutes3("note_screen")
}
