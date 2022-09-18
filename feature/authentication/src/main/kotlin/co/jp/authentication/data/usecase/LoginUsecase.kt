package co.jp.authentication.data.usecase

import co.jp.authentication.data.repository.LoginRepository
import javax.inject.Inject

class LoginUsecase @Inject constructor(
    private val repository: LoginRepository
) {
    suspend fun execute(
        email: String,
        password: String
    ) = repository.doLogin(email, password)
}
