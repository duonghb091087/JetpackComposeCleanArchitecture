package co.jp.authention.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.jp.core.ui.compose.AppTheme

@Composable
fun LoginScreen() {
    Text(text = "Login")
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen()
    }
}
