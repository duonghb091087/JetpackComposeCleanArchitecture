package co.jp.authentication.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.jp.core.ui.compose.AppTheme

@Composable
fun RegisterScreen() {
    Text(text = "Register")
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    AppTheme {
        RegisterScreen()
    }
}
