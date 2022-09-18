package co.jp.authentication.ui

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.jp.authentication.data.usecase.LoginUsecase
import co.jp.core.ui.di.ResourceProvider
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
    private val loginUsecase: LoginUsecase
) : ViewModel() {

    private val _onEffect = Channel<Effect>(Channel.BUFFERED)
    val onEffect = _onEffect.receiveAsFlow()

    private val _uiState = MutableStateFlow(State())
    val uiState: StateFlow<State> = _uiState

    private fun doLogin(email: String, password: String) {
        viewModelScope.launch {
            loginUsecase.execute(email, password)
                .onStart { }
                .onCompletion {}
                .catch {
                    Log.e("@@@@@@@@@@@@@@@@", "error : ${it.message}")
                    _onEffect.send(Effect.LoginFailure)
                }
                .collect {
                    _onEffect.send(Effect.LoginSuccess)
                }
        }
    }

    fun onEvent(event: Event) {
        when (event) {
            is Event.Login -> doLogin(event.email, event.password)
            is Event.ChangedEmail -> _uiState.update {
                it.copy(email = event.email)
            }
            is Event.ChangedPassword -> _uiState.update {
                it.copy(email = event.password)
            }
            else -> {}
        }
    }

    sealed class Event {
        data class Login(val email: String, val password: String) : Event()
        data class ChangedEmail(val email: String) : Event()
        data class ChangedPassword(val password: String) : Event()
    }

    data class State(
        val email: String = "",
        val password: String = ""
    )

    sealed class Effect {
        object LoginSuccess : Effect()
        object LoginFailure : Effect()
        data class Loading(val isShow: Boolean) : Effect()
    }
}
