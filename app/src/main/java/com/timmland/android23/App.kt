package com.timmland.android23
import android.app.Application
import android.content.Context
import androidx.room.Room
import com.timmland.android23.utils.PreferenceHelper

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper
        sharedPreferences.init(applicationContext)
    }
}