package co.jp.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.main.ui.HomeScreen

fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(startDestination = "home", route = "main") {
        composable("home") { HomeScreen() }
    }
}
