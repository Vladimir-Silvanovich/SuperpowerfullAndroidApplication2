package com.example.chudoapplication

import android.app.Application
import com.example.chudoapplication.data.AppContainer
import com.example.chudoapplication.data.AppDataContainer

class MainApp: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}