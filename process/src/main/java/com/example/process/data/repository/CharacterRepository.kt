package com.example.process.data.repository

import androidx.paging.PagingSource
import com.example.process.domain.model.Character

interface CharacterRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}