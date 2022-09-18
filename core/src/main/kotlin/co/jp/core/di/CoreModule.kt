package co.jp.core.di

import co.jp.core.analytics.EventTracker
import co.jp.core.analytics.EventTrackerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Singleton
    @Provides
    fun provideEventTracker(): EventTracker = EventTrackerImpl()
}
