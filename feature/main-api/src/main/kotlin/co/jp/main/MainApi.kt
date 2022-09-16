package co.jp.main

import androidx.compose.runtime.staticCompositionLocalOf

interface MainApi {
    fun navigateToHome()
}

val MainNavigator = staticCompositionLocalOf<MainApi> {
    error("MainNavigator not found")
}
