package co.jp.main.navigation

import androidx.navigation.NavController
import co.jp.main.MainApi

class MainApiImpl(
    private val navController: NavController
) : MainApi {
    override fun navigateToHome() {
        navController.navigate(MainDirections.home.destination)
    }
}
