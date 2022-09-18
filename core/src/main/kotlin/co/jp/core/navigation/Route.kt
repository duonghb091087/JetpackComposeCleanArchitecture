package co.jp.core.navigation

import androidx.navigation.NamedNavArgument

interface Route {

    val arguments: List<NamedNavArgument>

    val route: String
}
