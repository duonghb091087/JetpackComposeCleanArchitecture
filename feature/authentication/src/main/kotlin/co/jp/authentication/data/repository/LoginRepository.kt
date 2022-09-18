package co.jp.authentication.data.repository

import co.jp.jetpackcomposematerial3.network.AuthenticationServiceApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val api: AuthenticationServiceApi
) {
    suspend fun doLogin(email: String, password: String) = flow {
        emit(api.login(email, password))
    }.flowOn(Dispatchers.IO)
}