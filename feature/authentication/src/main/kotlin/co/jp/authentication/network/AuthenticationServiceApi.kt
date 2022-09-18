package co.jp.jetpackcomposematerial3.network

import co.jp.authentication.data.model.response.LoginResponse
import co.jp.authentication.data.model.response.RegisterResponse
import retrofit2.Response
import retrofit2.http.POST

interface AuthenticationServiceApi {
    @POST("login")
    suspend fun login(email: String, password: String): Response<LoginResponse>

    @POST("register")
    suspend fun register(email: String, password: String): Response<RegisterResponse>
}
