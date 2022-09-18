package co.jp.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.main.ui.HomeScreen

fun NavGraphBuilder.mainGraph() {
    navigation(
        startDestination = MainDirections.Home.route,
        route = MainDirections.root.route
    ) {
        composable(
            route = MainDirections.Home.route,
            arguments = MainDirections.Home.arguments
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString(
                MainDirections.Home.KEY_USER_NAME
            ).toString()
            HomeScreen(userName)
        }
    }
}
