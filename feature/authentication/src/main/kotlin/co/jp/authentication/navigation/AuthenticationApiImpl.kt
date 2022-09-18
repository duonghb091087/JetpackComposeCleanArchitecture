package co.jp.authentication.navigation

import androidx.navigation.NavController
import co.jp.authentication.AuthenticationApi

class AuthenticationApiImpl(
    private val navController: NavController
) : AuthenticationApi {
    override fun navigateToLogin() {
        navController.navigate(AuthenticationDirections.login.destination)
    }

    override fun navigateToRegister() {
        navController.navigate(AuthenticationDirections.registration.destination)
    }

    override fun navigateToForgotPassword(email: String?) {
        navController.navigate(AuthenticationDirections.ForgotPassword.navigate(email))
    }
}
