package co.jp.authentication.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import co.jp.main.MainApi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val mainApi: MainApi
) : ViewModel() {

    fun navigateHomeScreen() {
        mainApi.navigateToHomeScreen()
    }
}
