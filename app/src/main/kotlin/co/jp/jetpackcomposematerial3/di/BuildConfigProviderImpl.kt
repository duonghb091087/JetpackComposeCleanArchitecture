package co.jp.jetpackcomposematerial3.di

import co.jp.core.ui.di.BuildConfigProvider
import co.jp.jetpackcomposematerial3.BuildConfig

class BuildConfigProviderImpl : BuildConfigProvider {

    companion object {
        private const val BUILD_TYPE_DEBUG = "debug"
        private const val BUILD_TYPE_RELEASE = "release"
    }

    override fun isDebugBuildType() = BuildConfig.BUILD_TYPE == BUILD_TYPE_DEBUG

    override fun isReleaseBuildType() = BuildConfig.BUILD_TYPE == BUILD_TYPE_RELEASE

    override fun isDebug() = BuildConfig.DEBUG

    override fun versionName() = BuildConfig.VERSION_NAME

    override fun versionCode() = BuildConfig.VERSION_CODE

    override fun apiEndPoint() = BuildConfig.API_ENDPOINT
}
