package co.jp.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.main.ui.HomeScreen

fun NavGraphBuilder.mainGraph() {
    navigation(startDestination = "home", route = "main") {
        composable("home") { HomeScreen() }
    }
}
