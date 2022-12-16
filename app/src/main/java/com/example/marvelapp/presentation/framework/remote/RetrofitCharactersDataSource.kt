package com.example.marvelapp.presentation.framework.remote

import com.example.marvelapp.presentation.framework.network.MarvelAPI
import com.example.marvelapp.presentation.framework.network.response.DataWrapperResponse
import com.example.process.data.repository.CharactersRemoteDataSource
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val marvelApi: MarvelAPI
) : CharactersRemoteDataSource<DataWrapperResponse> {

    override suspend fun fetchCharacters(queries: Map<String, String>): DataWrapperResponse {
        return marvelApi.getCharacters(queries)
    }
}