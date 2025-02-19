package com.example.chudoapplication.data.network

import androidx.compose.runtime.Composable
import com.example.chudoapplication.domain.models.UserModel
import com.fasterxml.jackson.databind.ObjectMapper
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.serializer.JacksonSerializer
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.put
import kotlinx.serialization.json.Json

private const val SUPABASE_URL = "https://rjbskedzyfdmynpbwygf.supabase.co"
private const val SUPABASE_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJqYnNrZWR6eWZkbXlucGJ3eWdmIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzk3Njc4NjIsImV4cCI6MjA1NTM0Mzg2Mn0.Uk8fyMjDlLtamK540Nhp1wIbAX7DYza-X-kD38qMe_8"

val supabase = createSupabaseClient(
    supabaseUrl = "https://rjbskedzyfdmynpbwygf.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJqYnNrZWR6eWZkbXlucGJ3eWdmIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzk3Njc4NjIsImV4cCI6MjA1NTM0Mzg2Mn0.Uk8fyMjDlLtamK540Nhp1wIbAX7DYza-X-kD38qMe_8"
) {
    install(Postgrest)
}