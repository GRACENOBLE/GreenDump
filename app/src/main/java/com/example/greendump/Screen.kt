package com.example.greendump

sealed class Screen(val route: String){
    object LandingPage : Screen("LandingPage")
    object SignUp : Screen("SignUp")
    object SignIn : Screen("SignIn")
    object HomePage : Screen("HomePage")
    object LocationPage : Screen("LocationPage")
    object Wallet : Screen("Wallet")
    object SubscriptionPlanPage : Screen("SubscriptionPlanPage")
    object PaymentMethod : Screen("PaymentMethod")
    object ServicePricesPage : Screen("ServicePricesPage")
    object BlogPage : Screen("BlogPage")
}
