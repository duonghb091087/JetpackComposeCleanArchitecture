package co.jp.authentication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.authentication.ui.LoginScreen
import co.jp.authentication.ui.RegisterScreen

fun NavGraphBuilder.authenticationGraph(navController: NavController) {
    navigation(startDestination = "login", route = "authentication") {
        composable("login") { LoginScreen() }
        composable("registration") { RegisterScreen() }
    }
}
