package co.jp.authentication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import co.jp.authentication.navigation.AuthenticationDirections
import co.jp.authentication.ui.LoginViewModel.Effect
import co.jp.authentication.ui.LoginViewModel.Event
import co.jp.core.component.AppToolbar
import co.jp.core.component.CommonAlertDialog
import co.jp.core.component.LoadingDialog
import co.jp.core.navigation.AppNavigator
import co.jp.core.theme.AppTheme
import co.jp.core.utils.extension.collectInLaunchedEffect
import co.jp.feature.authentication.R
import co.jp.main.MainNavigator

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {
    val navigator = AppNavigator.current
    val mainNavigator = MainNavigator.current

    val uiState = viewModel.uiState.collectAsState()
    val email = uiState.value.email
    val password = uiState.value.password
    val loading = uiState.value.loading
    val showError = uiState.value.error
    val errorMessage = uiState.value.errorMessage

    viewModel.onEffect.collectInLaunchedEffect { effect ->
        when (effect) {
            is Effect.SuccessLogin -> {
                navigator.pop()
                mainNavigator.navigateToHome("nokadev")
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppToolbar(stringResource(R.string.title_login))
        Button(
            modifier = Modifier.size(124.dp),
            onClick = {
                viewModel.onEvent(Event.Submit(email, password))
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

        // show loading
        if (loading) {
            LoadingDialog()
        }

        if (showError) {
            CommonAlertDialog(
                title = "ERROR",
                confirmButtonText = "Cancel",
                message = errorMessage,
                onClickConfirmButton = {
                    viewModel.onEvent(Event.DismissDialog)
                },
                onDismissRequest = {
                    viewModel.onEvent(Event.DismissDialog)
                }
            )
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
