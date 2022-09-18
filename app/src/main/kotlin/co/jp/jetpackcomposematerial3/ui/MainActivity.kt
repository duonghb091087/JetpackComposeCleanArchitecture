package co.jp.jetpackcomposematerial3.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import co.jp.authentication.AuthenticationNavigator
import co.jp.authentication.navigation.AuthenticationApiImpl
import co.jp.authentication.navigation.AuthenticationDirections
import co.jp.authentication.navigation.authenticationGraph
import co.jp.core.navigation.AppNavigator
import co.jp.core.navigation.NavigatorImpl
import co.jp.core.theme.AppTheme
import co.jp.main.MainNavigator
import co.jp.main.navigation.MainApiImpl
import co.jp.main.navigation.mainGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppContent()
                }
            }
        }
    }
}

/**
 * App navigator, navigator to modules
 */
@Composable
fun AppContent() {
    val navController = rememberNavController()
    CompositionLocalProvider(
        AppNavigator provides NavigatorImpl(navController),
        MainNavigator provides MainApiImpl(navController),
        AuthenticationNavigator provides AuthenticationApiImpl(navController)
    ) {
        AppGraph(navController)
    }
}

/**
 * App navigation graphs
 */
@Composable
fun AppGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = AuthenticationDirections.root.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        mainGraph()
        authenticationGraph()
    }
}
