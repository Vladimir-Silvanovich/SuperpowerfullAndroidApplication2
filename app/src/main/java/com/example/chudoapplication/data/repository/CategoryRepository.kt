package com.example.chudoapplication.data.repository

import com.example.chudoapplication.data.entities.CategoryDto

interface CategoryRepository {
    suspend fun getCategories(): List<CategoryDto>?
}