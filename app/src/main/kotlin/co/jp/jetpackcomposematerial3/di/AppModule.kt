package co.jp.jetpackcomposematerial3.di

import co.jp.core.ui.di.BuildConfigProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Module for networking
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideBuildConfigProvider(): BuildConfigProvider {
        return BuildConfigProviderImpl()
    }
}
