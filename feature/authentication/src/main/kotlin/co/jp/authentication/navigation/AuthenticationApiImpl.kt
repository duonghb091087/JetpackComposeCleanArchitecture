package co.jp.authentication.navigation

import androidx.navigation.NavController
import co.jp.authentication.AuthenticationApi

class AuthenticationApiImpl(
    private val navController: NavController
) : AuthenticationApi {
    override fun navigateToLogin() {
        navController.navigate(AuthenticationDirections.login.route)
    }
}
