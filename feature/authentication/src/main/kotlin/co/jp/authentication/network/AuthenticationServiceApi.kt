package co.jp.jetpackcomposematerial3.network

import co.jp.authentication.data.model.response.LoginResponse
import co.jp.authentication.data.model.response.RegisterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthenticationServiceApi {
    @GET("everything?q=tesla&from=2022-08-18&sortBy=publishedAt&apiKey=af2a8e4d65c94ba2bb808b97804afd57")
    suspend fun login(): LoginResponse

    @GET("everything?q=tesla&from=2022-08-18&sortBy=publishedAt&apiKey=API_KEY")
    suspend fun testLoginError(): LoginResponse

    @POST("register")
    suspend fun register(email: String, password: String): Response<RegisterResponse>
}
