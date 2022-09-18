package co.jp.authentication.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import co.jp.core.navigation.NavigationCommand

object AuthenticationDirections {
    // no argument
    val root = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "authentication"
    }

    // no argument
    val login = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "login"
    }

    // no argument
    val registration = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "registration"
    }

    // with arguments
    object ForgotPassword {
        const val KEY_EMAIL = "email"
        private const val ROUTE = "forgot_password"
        const val destination = "$ROUTE/{$KEY_EMAIL}"
        val arguments = listOf(
            navArgument(KEY_EMAIL) { type = NavType.StringType }
        )

        fun navigate(email: String? = null) = "$ROUTE/$email"
    }
}
