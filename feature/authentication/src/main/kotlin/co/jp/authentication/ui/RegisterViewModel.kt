package co.jp.authentication.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import co.jp.authentication.data.usecase.LoginUsecase
import co.jp.core.ui.di.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val resourceProvider: ResourceProvider,
    private val loginUsecase: LoginUsecase
) : ViewModel() {

    fun doRegister(email: String, password: String) {
    }
}
