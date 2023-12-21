package com.example.greendump

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.LandingPage.route
    ){
        composable(
            route = Screen.LandingPage.route
        ){
            LandingPage(navController = navController)
        }

        composable(
            route = Screen.SignUp.route
        ){
            SignUp()
        }
    }
}

