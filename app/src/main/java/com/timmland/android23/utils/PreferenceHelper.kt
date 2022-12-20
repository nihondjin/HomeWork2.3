package com.timmland.android23.utils

import  android.content.Context
import android.content.SharedPreferences

object PreferenceHelper {

    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences("gucken", Context.MODE_PRIVATE)
    }

    var gucken: Boolean
        get() = sharedPreferences.getBoolean("isShow", false)
        set(value) = sharedPreferences.edit().putBoolean("isShow", value).apply()
}