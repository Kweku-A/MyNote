package com.kweku.armah.mynote.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.kweku.armah.mynote.presentation.ui.screens.navigateToMyNoteListScreen

@Composable
fun MyNotesNavHost() {
    val navController = rememberNavController()
    val navigateToScreen: (String) -> Unit = { navController.navigate(it) }

    NavHost(navController = navController, startDestination = NavRoutes.ListScreen.route) {
        navigateToMyNoteListScreen(navigateToScreen = navigateToScreen)
    }
}
