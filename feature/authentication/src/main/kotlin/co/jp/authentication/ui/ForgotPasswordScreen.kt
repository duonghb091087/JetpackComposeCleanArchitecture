package co.jp.authentication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.core.component.AppToolbar
import co.jp.core.theme.AppTheme

@Composable
fun ForgotPasswordScreen(
    viewModel: ForgotPasswordViewModel = hiltViewModel()
) {
    Column {
        AppToolbar("Forgot Password")
        Text(text = "Forgot Password")
    }
}

@Preview(showBackground = true)
@Composable
fun ForgotPasswordPreview() {
    AppTheme {
        ForgotPasswordPreview()
    }
}
