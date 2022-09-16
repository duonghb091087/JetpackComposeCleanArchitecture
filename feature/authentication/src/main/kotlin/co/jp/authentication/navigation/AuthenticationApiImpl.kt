package co.jp.authentication.navigation

import android.util.Log
import co.jp.authentication.AuthenticationApi
import javax.inject.Inject

class AuthenticationApiImpl @Inject constructor() : AuthenticationApi {
    override fun navigateToLogin() {
        Log.d("@@@@@@@@@@@@@@@@@@", "navigateToLoginScreen")
    }

    override fun navigateToRegister() {
        Log.d("@@@@@@@@@@@@@@@@@@", "navigateToRegisterScreen")
    }
}
