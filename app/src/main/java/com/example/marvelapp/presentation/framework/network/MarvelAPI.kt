package com.example.marvelapp.presentation.framework.network

import com.example.marvelapp.presentation.framework.network.response.DataWrapperResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelAPI {

    @GET("characters")
    suspend fun getCharacters(
        @QueryMap
        queries: Map<String, String>
    ): DataWrapperResponse
}