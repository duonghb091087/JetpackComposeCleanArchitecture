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
import co.jp.authentication.navigation.authenticationGraph
import co.jp.core.ui.compose.AppTheme
import co.jp.main.LocalNavigator
import co.jp.main.navigation.AppNavigator
import co.jp.main.navigation.mainGraph
import com.google.accompanist.insets.ProvideWindowInsets
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProvideWindowInsets {
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
}

@Composable
fun AppContent() {
    val navController = rememberNavController()
    CompositionLocalProvider(
        LocalNavigator provides AppNavigator(navController)
    ) {
        AppNavHost()
    }
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "authentication"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        mainGraph(navController)
        authenticationGraph(navController)
    }
}
