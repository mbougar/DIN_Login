package com.es.din_login.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.es.din_login.ui.screens.LoginScreen
import com.es.din_login.ui.screens.RegisterScreen
import com.es.din_login.ui.screens.SignInScreen
import com.es.din_login.ui.screens.SuccessScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("signin") { SignInScreen(navController) }
        composable("register") { RegisterScreen() }
        composable("success") { SuccessScreen() }
    }
}