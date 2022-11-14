package com.example.marvelapp.presentation.framework.network.response

data class CharacterResponse(
    val id: Int,
    val name: String,
    val thumbnail: ThumbnailResponse
)