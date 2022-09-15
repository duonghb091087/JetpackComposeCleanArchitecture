package co.jp.authentication.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.core.ui.compose.AppTheme

@Composable
fun LoginScreen(viewModel: LoginViewModel = hiltViewModel()) {
    Text(text = "Login")
    viewModel.navigateHomeScreen()
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen()
    }
}
