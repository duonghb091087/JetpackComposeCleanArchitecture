package co.jp.main.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import co.jp.core.navigation.Route

object MainDirections {
    val root = object : Route {
        override val arguments = emptyList<NamedNavArgument>()
        override val route = "main"
    }

    // with arguments
    object Home {
        const val KEY_USER_NAME = "user_name"
        private const val ROUTE = "home"
        const val route = "$ROUTE/{$KEY_USER_NAME}"
        val arguments = listOf(
            navArgument(KEY_USER_NAME) { type = NavType.StringType }
        )

        fun navigate(userName: String) = "$ROUTE/$userName"
    }
}
