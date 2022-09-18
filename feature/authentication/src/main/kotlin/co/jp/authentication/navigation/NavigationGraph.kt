package co.jp.authentication.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.authentication.ui.ForgotPasswordScreen
import co.jp.authentication.ui.LoginScreen
import co.jp.authentication.ui.RegisterScreen

fun NavGraphBuilder.authenticationGraph() {
    navigation(
        startDestination = AuthenticationDirections.login.destination,
        route = AuthenticationDirections.root.destination
    ) {
        composable(AuthenticationDirections.login.destination) { LoginScreen() }
        composable(AuthenticationDirections.registration.destination) { RegisterScreen() }
        composable(
            route = AuthenticationDirections.ForgotPassword.destination,
            arguments = AuthenticationDirections.ForgotPassword.arguments
        ) { backStackEntry ->
            val email =
                backStackEntry.arguments?.getString(AuthenticationDirections.ForgotPassword.KEY_EMAIL)
            ForgotPasswordScreen(email)
        }
    }
}
