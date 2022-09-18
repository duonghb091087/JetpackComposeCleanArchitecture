package co.jp.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.main.ui.HomeScreen

fun NavGraphBuilder.mainGraph() {
    navigation(
        startDestination = MainDirections.home.destination,
        route = MainDirections.root.destination
    ) {
        composable(MainDirections.home.destination) { HomeScreen() }
    }
}
