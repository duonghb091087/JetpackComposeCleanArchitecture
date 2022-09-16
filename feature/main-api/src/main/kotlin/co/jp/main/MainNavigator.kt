package co.jp.main

import androidx.compose.runtime.staticCompositionLocalOf

interface MainNavigator {
    fun navigateToHome()
}

val LocalNavigator = staticCompositionLocalOf<MainNavigator> {
    error("LocalNavigator not found")
}
