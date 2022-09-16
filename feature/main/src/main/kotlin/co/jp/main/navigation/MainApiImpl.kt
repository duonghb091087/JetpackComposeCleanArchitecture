package co.jp.main.navigation

import android.util.Log
import co.jp.main.MainApi
import javax.inject.Inject

class MainApiImpl @Inject constructor() : MainApi {
    override fun navigateToHome() {
        Log.d("@@@@@@@@@@@@@@@@@@", "navigateToHomeScreen")
    }
}
