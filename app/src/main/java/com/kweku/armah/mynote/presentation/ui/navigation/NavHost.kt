package com.kweku.armah.mynote.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.kweku.armah.feature2presentation.ui.screens.navigateToMyNoteListScreen2
import com.kweku.armah.feature3presentation.ui.navigation.NavRoutes3
import com.kweku.armah.feature3presentation.ui.screens.navigateToMyNoteListScreen3
import com.kweku.armah.presentation.ui.screens.navigateToMyNoteListScreenFeature1

@Composable
fun MyNotesNavHost() {
    val navController = rememberNavController()
    val navigateToScreen: (String) -> Unit = { navController.navigate(it) }

    NavHost(navController = navController, startDestination = NavRoutes3.ListScreen.route) {
        navigateToMyNoteListScreenFeature1(navigateToScreen = navigateToScreen)
        navigateToMyNoteListScreen2(navigateToScreen = navigateToScreen)
        navigateToMyNoteListScreen3(navigateToScreen = navigateToScreen)
    }
}
