package co.jp.authentication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.authentication.navigation.AuthenticationDirections
import co.jp.core.component.AppToolbar
import co.jp.core.navigation.AppNavigator
import co.jp.core.theme.AppTheme
import co.jp.main.MainNavigator

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {
    val navigator = AppNavigator.current
    val mainNavigator = MainNavigator.current

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppToolbar("Login")
        Button(
            modifier = Modifier.size(124.dp),
            onClick = {
                /* viewModel.onEvent(
                     Event.Login("nokadev@nokasoft.com", "abc123")
                 )*/
                navigator.pop()
                mainNavigator.navigateToHome("nokadev")
            }
        ) {
            Text("Submit Login to Home")
        }
        Button(
            modifier = Modifier.size(124.dp),
            onClick = { navigator.push(AuthenticationDirections.registration.route) }
        ) {
            Text("Register")
        }
        Button(
            modifier = Modifier.size(124.dp),
            onClick = { navigator.push(AuthenticationDirections.forgotPassword.route) }
        ) {
            Text("Forgot password")
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
