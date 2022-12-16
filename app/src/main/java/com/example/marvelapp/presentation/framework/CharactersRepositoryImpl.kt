package com.example.marvelapp.presentation.framework

import androidx.paging.PagingSource
import com.example.marvelapp.presentation.framework.network.response.DataWrapperResponse
import com.example.marvelapp.presentation.framework.paging.CharactersPagingSource
import com.example.process.data.repository.CharacterRepository
import com.example.process.data.repository.CharactersRemoteDataSource
import com.example.process.domain.model.Character
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharactersRemoteDataSource<DataWrapperResponse>
) : CharacterRepository {

    override fun getCharacters(query: String): PagingSource<Int, Character> {
        return CharactersPagingSource(remoteDataSource, query)
    }
}