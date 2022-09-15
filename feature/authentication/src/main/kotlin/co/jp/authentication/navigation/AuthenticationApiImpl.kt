package co.jp.authentication.navigation

import android.util.Log
import co.jp.authentication.AuthenticationApi
import javax.inject.Inject

class AuthenticationApiImpl @Inject constructor() : AuthenticationApi {
    override fun navigateToLoginScreen() {
        Log.d("@@@@@@@@@@@@@@@@@@", "navigateToLoginScreen")
    }

    override fun navigateToRegisterScreen() {
        Log.d("@@@@@@@@@@@@@@@@@@", "navigateToRegisterScreen")
    }
}
