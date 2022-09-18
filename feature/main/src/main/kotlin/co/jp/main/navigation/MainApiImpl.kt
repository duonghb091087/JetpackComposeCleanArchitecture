package co.jp.main.navigation

import androidx.navigation.NavController
import co.jp.main.MainApi

class MainApiImpl(
    private val navController: NavController
) : MainApi {
    override fun navigateToHome(userName: String) {
        navController.navigate(MainDirections.Home.navigate(userName))
    }
}
