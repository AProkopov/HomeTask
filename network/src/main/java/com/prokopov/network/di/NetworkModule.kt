package com.prokopov.network.di

import com.prokopov.network.NetworkResources
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideNetworkResources(): NetworkResources = NetworkResources()
}