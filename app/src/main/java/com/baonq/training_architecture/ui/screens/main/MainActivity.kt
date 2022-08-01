package com.baonq.training_architecture.ui.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.baonq.training_architecture.R
import com.baonq.training_architecture.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navHostFragment: NavHostFragment? =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment
        val navController: NavController? = navHostFragment?.navController
        navController?.let {
            val appBarConfiguration: AppBarConfiguration = AppBarConfiguration(it.graph)
            binding.toolbar.setupWithNavController(navController, appBarConfiguration)
        }
    }
}
