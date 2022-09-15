package co.jp.authentication.di

import co.jp.authentication.AuthenticationApi
import co.jp.authentication.navigation.AuthenticationApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureModule {

    @Binds
    abstract fun bindAuthenticationApi(
        authenticationApiImpl: AuthenticationApiImpl
    ): AuthenticationApi
}
