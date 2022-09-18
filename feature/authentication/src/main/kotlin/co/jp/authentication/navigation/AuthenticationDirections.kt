package co.jp.authentication.navigation

import androidx.navigation.NamedNavArgument
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

    // no argument
    val forgotPassword = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "forgot_password"
    }
}
