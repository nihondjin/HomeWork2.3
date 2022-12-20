package com.timmland.android23.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.timmland.android23.R
import com.timmland.android23.utils.PreferenceHelper

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment

        navController = navHostFragment.navController

        when (PreferenceHelper.gucken) {
            false -> {
                navController.navigate(R.id.onBoardFragment)
               // navController.popBackStack()
            }
            else -> {
                navController.navigate(R.id.homeFragment)
            }
        }
    }
}