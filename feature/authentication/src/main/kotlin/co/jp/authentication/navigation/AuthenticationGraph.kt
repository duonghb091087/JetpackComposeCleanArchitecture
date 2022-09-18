package co.jp.authentication.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import co.jp.authentication.ui.ForgotPasswordScreen
import co.jp.authentication.ui.LoginScreen
import co.jp.authentication.ui.RegisterScreen

fun NavGraphBuilder.authenticationGraph() {
    navigation(
        startDestination = AuthenticationDirections.login.route,
        route = AuthenticationDirections.root.route
    ) {
        composable(AuthenticationDirections.login.route) { LoginScreen() }
        composable(AuthenticationDirections.registration.route) { RegisterScreen() }
        composable(AuthenticationDirections.forgotPassword.route) { ForgotPasswordScreen() }
    }
}
