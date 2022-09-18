package co.jp.main.navigation

import androidx.navigation.NamedNavArgument
import co.jp.core.ui.navigation.NavigationCommand

object MainDirections {
    val root = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "main"
    }

    val home = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()
        override val destination = "home"
    }
}
