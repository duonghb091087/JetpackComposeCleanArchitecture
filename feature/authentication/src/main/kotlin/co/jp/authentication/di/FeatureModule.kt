package co.jp.authentication.di

import co.jp.jetpackcomposematerial3.network.AuthenticationServiceApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FeatureModule {

    @Singleton
    @Provides
    fun provideAuthenticationService(retrofit: Retrofit): AuthenticationServiceApi =
        retrofit.create(AuthenticationServiceApi::class.java)
}
