package com.example.greendump

sealed class Screen(val route: String){
    object LandingPage : Screen("LandingPage")
    object SignUp : Screen("SignUp")
}
