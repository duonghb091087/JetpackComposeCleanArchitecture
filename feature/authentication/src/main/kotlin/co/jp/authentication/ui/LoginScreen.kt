package co.jp.authentication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.authentication.AuthenticationNavigator
import co.jp.authentication.ui.LoginViewModel.Event
import co.jp.core.theme.AppTheme
import co.jp.main.MainNavigator

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {
    val mainNavigator = MainNavigator.current
    val authenticationNavigator = AuthenticationNavigator.current
    Column {
        Text("Login")
        Button(
            modifier = Modifier.size(124.dp),
            onClick = {
               /* viewModel.onEvent(
                    Event.Login("nokadev@nokasoft.com", "abc123")
                )*/
                mainNavigator.navigateToHome("nokadev")
            }
        ) {
            Text("Submit Login to Home")
        }
        Button(
            modifier = Modifier.size(124.dp),
            onClick = { authenticationNavigator.navigateToRegister() }
        ) {
            Text("Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen()
    }
}
