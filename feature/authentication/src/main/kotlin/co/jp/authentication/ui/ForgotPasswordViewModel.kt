package co.jp.authentication.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import co.jp.core.di.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ForgotPasswordViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val resourceProvider: ResourceProvider
) : ViewModel()
