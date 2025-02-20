package com.example.chudoapplication.data.repository.impl

import com.example.chudoapplication.data.entities.CategoryDto
import com.example.chudoapplication.data.network.supabase
import com.example.chudoapplication.data.repository.CategoryRepository
import com.example.chudoapplication.domain.models.Category
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.postgrest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryRepositoryImpl() : CategoryRepository {
    override suspend fun getCategories(): List<CategoryDto>? {
        return withContext(Dispatchers.IO) {
            val result = supabase.postgrest.from("categories").select().decodeList<CategoryDto>()
            result
        }
    }
}