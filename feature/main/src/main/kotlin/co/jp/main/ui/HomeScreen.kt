package co.jp.main.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.jp.core.ui.compose.AppTheme

@Composable
fun HomeScreen() {
    Text(text = "Home")
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AppTheme {
        HomeScreen()
    }
}
