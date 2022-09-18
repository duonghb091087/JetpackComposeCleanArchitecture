package co.jp.main.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.jp.authentication.AuthenticationNavigator
import co.jp.core.component.AppToolbar
import co.jp.core.navigation.AppNavigator
import co.jp.core.theme.AppTheme
import co.jp.feature.main.R

@Composable
fun HomeScreen(
    userName: String
) {
    val navigator = AppNavigator.current
    val authenticationNavigator = AuthenticationNavigator.current
    Column {
        AppToolbar(stringResource(R.string.title_home))
        Text("userName : $userName")
        Button(
            modifier = Modifier.size(124.dp),
            onClick = {
                navigator.pop()
                authenticationNavigator.navigateToLogin()
            }
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
