package com.example.marvelapp.presentation.framework.di

import com.example.marvelapp.presentation.framework.CharactersRepositoryImpl
import com.example.marvelapp.presentation.framework.network.response.DataWrapperResponse
import com.example.marvelapp.presentation.framework.remote.RetrofitCharactersDataSource
import com.example.process.data.repository.CharacterRepository
import com.example.process.data.repository.CharactersRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharacterRepository(repository: CharactersRepositoryImpl) : CharacterRepository

    @Binds
    fun bindRemoteDataSource(
        dataSource: RetrofitCharactersDataSource
    ) : CharactersRemoteDataSource<DataWrapperResponse>
}