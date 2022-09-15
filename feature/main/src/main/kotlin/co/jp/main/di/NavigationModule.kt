package co.jp.main.di

import co.jp.main.navigation.MainApiImpl
import co.jp.main_api.MainApi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {

    @Binds
    abstract fun bindMainApi(
        mainApiImpl: MainApiImpl
    ): MainApi
}
