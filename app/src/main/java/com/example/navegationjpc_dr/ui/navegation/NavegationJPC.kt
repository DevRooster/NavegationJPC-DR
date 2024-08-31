package com.example.navegationjpc_dr.ui.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navegationjpc_dr.ui.presentation.screens.CalcUPeU
import com.example.navegationjpc_dr.ui.presentation.screens.HomeScreen
import com.example.navegationjpc_dr.ui.presentation.screens.ProfileScreen
import com.example.navegationjpc_dr.ui.presentation.screens.SettingsScreen

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("profile") { ProfileScreen() }
        composable("settings") { SettingsScreen() }
        composable("calc") { CalcUPeU() }
    }
}