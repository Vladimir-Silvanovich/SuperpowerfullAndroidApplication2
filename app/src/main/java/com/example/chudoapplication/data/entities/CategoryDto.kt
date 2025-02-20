package com.example.chudoapplication.data.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CategoryDto(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String
)
