package co.jp.core.di

import android.content.Context
import co.jp.core.R
import co.jp.core.data.entity.ErrorMessageException
import co.jp.core.data.model.ErrorResponse
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.HttpException
import timber.log.Timber
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject

class HandleApiError @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getMessage(throwable: Throwable): String =
        when (throwable) {
            is ErrorMessageException -> {
                Timber.e(throwable)
                throwable.errorMessage
            }
            is HttpException -> {
                Timber.e(throwable)
                tryExtractErrorMessage(throwable) ?: context.getString(R.string.error_unknown)
            }
            else -> {
                if (throwable !is SocketTimeoutException && throwable !is UnknownHostException) {
                    Timber.e(throwable, "Unknown exception")
                }
                context.getString(R.string.error_disconnected)
            }
        }

    private fun tryExtractErrorMessage(exception: HttpException): String? {
        return runCatching { exception.asResponse()?.message }
            .onFailure {
                // JSONパースエラー。予期しないエラーなのでログを送る
                Timber.e(it, "Failed to parse JSON from server side")
            }
            .getOrNull()
    }

    private fun HttpException.asResponse(): ErrorResponse? {
        val body = response()?.errorBody()?.string() ?: return null
        return Gson().fromJson(body, ErrorResponse::class.java)
    }
}
