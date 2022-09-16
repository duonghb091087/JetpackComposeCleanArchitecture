package co.jp.authentication.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.core.ui.compose.AppTheme
import co.jp.main.LocalNavigator
import co.jp.main.MainNavigator

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    navigator: MainNavigator = LocalNavigator.current
) {
    Text(text = "Login")
    navigator.navigateToHome()
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen()
    }
}
