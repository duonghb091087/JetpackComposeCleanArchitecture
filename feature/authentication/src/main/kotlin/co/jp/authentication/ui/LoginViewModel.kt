package co.jp.authentication.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.jp.authentication.data.usecase.LoginUsecase
import co.jp.core.di.HandleApiError
import co.jp.core.di.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val resourceProvider: ResourceProvider,
    private val handleApiError: HandleApiError,
    private val loginUsecase: LoginUsecase
) : ViewModel() {

    private val _onEffect = Channel<Effect>(Channel.BUFFERED)
    val onEffect = _onEffect.receiveAsFlow()

    private val _uiState = MutableStateFlow(State())
    val uiState: StateFlow<State> = _uiState

    private fun doLogin(email: String, password: String) {
        viewModelScope.launch {
            loginUsecase.execute(email, password)
                .onStart {
                    showLoading(true)
                }
                .onCompletion {
                    showLoading(false)
                }
                .catch {
                    showApiError(
                        true,
                        handleApiError.getMessage(it)
                    )
                }
                .collect {
                    _onEffect.send(Effect.SuccessLogin)
                }
        }
    }

    private fun testLoginError(email: String, password: String) {
        viewModelScope.launch {
            loginUsecase.testLoginError(email, password)
                .onStart {
                    showLoading(true)
                }
                .onCompletion {
                    showLoading(false)
                }
                .catch {
                    showApiError(
                        true,
                        handleApiError.getMessage(it)
                    )
                }
                .collect {
                    _onEffect.send(Effect.SuccessLogin)
                }
        }
    }

    private fun showLoading(isShow: Boolean) {
        _uiState.update {
            it.copy(loading = isShow)
        }
    }

    private fun showApiError(isShow: Boolean, message: String = "") {
        _uiState.update {
            it.copy(
                error = isShow,
                errorMessage = message
            )
        }
    }

    fun onEvent(event: Event) {
        when (event) {
            is Event.Submit -> doLogin(event.email, event.password)
            is Event.SubmitError -> testLoginError(event.email, event.password)
            is Event.ChangedEmail -> _uiState.update {
                it.copy(email = event.email)
            }
            is Event.ChangedPassword -> _uiState.update {
                it.copy(email = event.password)
            }
            is Event.DismissDialog -> showApiError(false)
        }
    }

    sealed class Event {
        data class Submit(val email: String, val password: String) : Event()
        data class SubmitError(val email: String, val password: String) : Event()
        data class ChangedEmail(val email: String) : Event()
        data class ChangedPassword(val password: String) : Event()
        object DismissDialog : Event()
    }

    data class State(
        val email: String = "nokadev@nokasoft.com",
        val password: String = "abc123",
        val loading: Boolean = false,
        val error: Boolean = false,
        val errorMessage: String = ""
    )

    sealed class Effect {
        object SuccessLogin : Effect()
    }
}
