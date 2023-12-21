package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun HomePage(navController: NavController){
    HomePageBackground()
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        HomePageHeader()
        val buttonRounding = 50.dp
        val fontSize = 20.sp
        Column (
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(
                    onClick = { navController.navigate( route = Screen.LocationPage.route) },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.pick_up),
                            contentDescription = stringResource(R.string.pickup_icon)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.schedule_pickup),
                            style = TextStyle(fontSize = fontSize)
                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.Wallet.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.wallet),
                            contentDescription = stringResource(R.string.wallet)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.wallet),
                            style = TextStyle(fontSize = fontSize)

                        )
                    }
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(
                    onClick = {
                        navController.navigate( route = Screen.SubscriptionPlanPage.route)
                              },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.subscription),
                            contentDescription = stringResource(R.string.subscription)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.subscription_plan),
                            style = TextStyle(fontSize = fontSize)
                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.PaymentMethod.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.debit_card),
                            contentDescription = stringResource(R.string.payment_methods)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.payment_methods_2),
                            style = TextStyle(fontSize = fontSize)
                        )
                    }
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Button(
                    onClick = {
                        navController.navigate( route = Screen.ServicePricesPage.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.price_list),
                            contentDescription = stringResource(R.string.service_prices)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.our_service_prices),
                            style = TextStyle(fontSize = fontSize)
                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.BlogPage.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp),
                            painter = painterResource(id = R.drawable.blog),
                            contentDescription = stringResource(R.string.our_blog)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(id = R.string.our_blog),
                            style = TextStyle(fontSize = fontSize)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun HomePageBackground (){
    Surface (
        modifier = Modifier

    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentScale = ContentScale.Crop,
            alpha = 0.2F,
            contentDescription = stringResource(id = R.string.background_image)
        )
    }
}

@Composable
fun HomePageHeader (){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ){

        Image(
            modifier = Modifier
                .size(40.dp)
                .padding(start = 10.dp),
            painter = painterResource(id = R.drawable.left),
            contentDescription = stringResource(R.string.back_button)
        )

        Text(
            text = "HOME:",
            style = TextStyle(fontSize = 40.sp)
        )

        Column(
            modifier = Modifier
                .padding(
                    end = 10.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(40.dp),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = stringResource(R.string.profile_icon)
            )

            Text(text = "Account")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomePagePreview (){
    HomePage(navController = rememberNavController())
}