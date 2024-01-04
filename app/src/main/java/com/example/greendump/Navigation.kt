package com.example.greendump

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


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
            SignUp(navController = navController)
        }

        composable(
            route = Screen.SignIn.route
        ){
            SignIn(navController = navController)
        }

        composable(
            route = Screen.HomePage.route
        ){
            HomePage(navController = navController)
        }

        composable(
            route = Screen.LocationPage.route
        ){
            LocationPage(navController = navController)
        }
        composable(
            route = Screen.Wallet.route
        ){
            WalletPage(navController = navController)
        }
        composable(
            route = Screen.SubscriptionPlanPage.route
        ){
            SubscriptionPlanPage()
        }
        composable(
            route = Screen.PaymentMethod.route
        ){
            PaymentMethod()
        }
        composable(
            route = Screen.ServicePricesPage.route
        ){
            ServicePricesPage()
        }
        composable(
            route = Screen.BlogPage.route
        ){
            BlogPage()
        }
    }
}