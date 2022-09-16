package co.jp.main.navigation

import androidx.navigation.NavController
import co.jp.main.MainNavigator

class AppNavigator(
    private val navController: NavController
) : MainNavigator {
    override fun navigateToHome() {
        navController.navigate("home")
    }
}
