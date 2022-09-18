package co.jp.authentication

import androidx.compose.runtime.staticCompositionLocalOf

interface AuthenticationApi {
    fun navigateToLogin()
    fun navigateToRegister()
    fun navigateToForgotPassword()
}

val AuthenticationNavigator = staticCompositionLocalOf<AuthenticationApi> {
    error("AuthenticationNavigator not found")
}
