package co.jp.authentication.navigation

import androidx.navigation.NamedNavArgument
import co.jp.core.navigation.Route

object AuthenticationDirections {
    // no argument
    val root = object : Route {
        override val arguments = emptyList<NamedNavArgument>()
        override val route = "authentication"
    }

    // no argument
    val login = object : Route {
        override val arguments = emptyList<NamedNavArgument>()
        override val route = "login"
    }

    // no argument
    val registration = object : Route {
        override val arguments = emptyList<NamedNavArgument>()
        override val route = "registration"
    }

    // no argument
    val forgotPassword = object : Route {
        override val arguments = emptyList<NamedNavArgument>()
        override val route = "forgot_password"
    }
}
