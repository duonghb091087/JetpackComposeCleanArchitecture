package co.jp.core.di

interface BuildConfigProvider {
    fun isDebugBuildType(): Boolean
    fun isReleaseBuildType(): Boolean
    fun isDebug(): Boolean
    fun versionName(): String
    fun versionCode(): Int
    fun apiEndPoint(): String
}
