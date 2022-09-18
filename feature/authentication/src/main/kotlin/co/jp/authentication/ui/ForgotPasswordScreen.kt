package co.jp.authentication.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.core.ui.theme.AppTheme

@Composable
fun ForgotPasswordScreen(
    email: String?,
    viewModel: ForgotPasswordViewModel = hiltViewModel()
) {
    Text(text = "Forgot Password with email : $email")
}

@Preview(showBackground = true)
@Composable
fun ForgotPasswordPreview() {
    AppTheme {
        ForgotPasswordPreview()
    }
}
