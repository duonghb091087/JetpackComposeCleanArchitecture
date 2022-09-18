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
        emit(api.login())
    }.flowOn(Dispatchers.IO)

    suspend fun testLoginError(email: String, password: String) = flow {
        emit(api.testLoginError())
    }.flowOn(Dispatchers.IO)
}
