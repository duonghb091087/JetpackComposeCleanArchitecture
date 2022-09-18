package co.jp.core.navigation

import androidx.lifecycle.LiveData
import androidx.navigation.NavController

class NavigatorImpl(private val navController: NavController) : Navigator {
    override fun pop(): Boolean {
        return navController.popBackStack()
    }

    override fun push(destination: String) {
        navController.navigate(destination)
    }

    override fun replace(destination: String) {
        navController.popBackStack()
        navController.navigate(destination)
    }

    override fun popAllAndPush(destination: String) {
        navController.navigate(destination) {
            popUpTo(0)
        }
    }

    override fun popUntil(destination: String, inclusive: Boolean): Boolean {
        return navController.popBackStack(destination, inclusive = inclusive)
    }

    override fun popUntilAndPush(untilDestination: String, pushDestination: String, inclusive: Boolean) {
        navController.navigate(pushDestination) {
            popUpTo(untilDestination) {
                this.inclusive = inclusive
            }
        }
    }

    override fun popWithResult(key: String, value: Any?): Boolean {
        navController.previousBackStackEntry?.savedStateHandle?.set(key, value)
        return pop()
    }

    override fun <T> observeResult(key: String): LiveData<T>? {
        return navController.currentBackStackEntry?.savedStateHandle?.getLiveData(key)
    }
}