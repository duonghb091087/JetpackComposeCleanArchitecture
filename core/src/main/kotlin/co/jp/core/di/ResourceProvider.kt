package co.jp.core.di

import android.content.Context
import androidx.annotation.ArrayRes
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ResourceProvider @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getString(@StringRes resId: Int, vararg args: Any): String = context.getString(resId, *args)
    fun getColor(@ColorRes resId: Int): Int = ContextCompat.getColor(context, resId)
    fun getInteger(@IntegerRes resId: Int): Int = context.resources.getInteger(resId)
    fun getDimensionPixelSize(@DimenRes resId: Int) = context.resources.getDimensionPixelSize(resId)
    fun getIntArray(@ArrayRes resId: Int) = context.resources.getIntArray(resId)
    fun getStringArray(@ArrayRes resId: Int) = context.resources.getStringArray(resId)
    fun getDrawable(@DrawableRes resId: Int) = ContextCompat.getDrawable(context, resId)
}
