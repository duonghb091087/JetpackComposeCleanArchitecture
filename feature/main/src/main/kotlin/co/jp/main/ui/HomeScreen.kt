package co.jp.main.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.jp.authentication.AuthenticationNavigator
import co.jp.core.theme.AppTheme

@Composable
fun HomeScreen(
    userName: String
) {
    val navigation = AuthenticationNavigator.current
    Column {
        Text("HOME")
        Text("userName : $userName")
        Button(
            modifier = Modifier.size(124.dp),
            onClick = { navigation.navigateToLogin() }
        ) {
            Text("Logout")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AppTheme {
        HomeScreen("nokadev")
    }
}
