package com.example.retrofitmodelview.di

import com.example.retrofitmodelview.data.repository.MainMainRepositoryImpl
import com.example.retrofitmodelview.domain.MainRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun provideMainRepositoryImpl(repository: MainMainRepositoryImpl): MainRepository

}