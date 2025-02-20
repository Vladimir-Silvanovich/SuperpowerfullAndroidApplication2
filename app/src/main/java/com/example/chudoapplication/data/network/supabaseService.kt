package com.example.chudoapplication.data.network

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

val supabase = createSupabaseClient(
    supabaseUrl = "https://rjbskedzyfdmynpbwygf.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJqYnNrZWR6eWZkbXlucGJ3eWdmIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzk3Njc4NjIsImV4cCI6MjA1NTM0Mzg2Mn0.Uk8fyMjDlLtamK540Nhp1wIbAX7DYza-X-kD38qMe_8"
) {
    install(Auth)
    install(Postgrest)
}