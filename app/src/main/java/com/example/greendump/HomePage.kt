package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun HomePage(navController: NavController){

    val poppins = FontFamily(
        Font(R.font.poppins_black , FontWeight.Black),
        Font(R.font.poppins_blackitalic , FontWeight.Black),
        Font(R.font.poppins_bold , FontWeight.Bold),
        Font(R.font.poppins_bolditalic , FontWeight.Bold),
        Font(R.font.poppins_extrabold , FontWeight.ExtraBold),
        Font(R.font.poppins_extrabolditalic , FontWeight.ExtraBold),
        Font(R.font.poppins_extralight , FontWeight.ExtraLight),
        Font(R.font.poppins_extralightitalic , FontWeight.ExtraLight),
        Font(R.font.poppins_italic , FontWeight.Normal),
        Font(R.font.poppins_light , FontWeight.Light),
        Font(R.font.poppins_lightitalic , FontWeight.Light),
        Font(R.font.poppins_medium , FontWeight.Medium),
        Font(R.font.poppins_mediumitalic , FontWeight.Medium),
        Font(R.font.poppins_regular , FontWeight.Normal),
        Font(R.font.poppins_thin , FontWeight.Thin),
        Font(R.font.poppins_thinitalic, FontWeight.Thin),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_semibolditalic, FontWeight.SemiBold)
    )

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
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.pick_up),
                            contentDescription = stringResource(R.string.pickup_icon)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Pickup",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            ),


                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.Wallet.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.wallet),
                            contentDescription = stringResource(R.string.wallet)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(R.string.wallet),
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            )

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
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.subscription),
                            contentDescription = stringResource(R.string.subscription)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Plan",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            )
                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.PaymentMethod.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.debit_card),
                            contentDescription = stringResource(R.string.payment_methods)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Cards",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            )
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
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(75.dp),
                            painter = painterResource(id = R.drawable.price_list),
                            contentDescription = stringResource(R.string.service_prices)
                        )
                        Spacer(modifier = Modifier.height(25.dp))
                        Text(
                            text = "Prices",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            )
                        )
                    }
                }
                Button(
                    onClick = {
                        navController.navigate( route = Screen.BlogPage.route)
                    },
                    shape = RoundedCornerShape(buttonRounding),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFF2e8355)),
                    modifier = Modifier
                        .size(width = 170.dp, height = 200.dp)

                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            modifier = Modifier
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.blog),
                            contentDescription = stringResource(R.string.our_blog)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = stringResource(id = R.string.our_blog),
                            style = TextStyle(
                                fontSize = fontSize,
                                fontFamily = poppins,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                            )
                        )
                    }
                }
            }

            Button(
                onClick = { },
                colors = ButtonDefaults
                    .buttonColors(Color(0xFFAA7A00)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        end = 20.dp
                    )
                    .height(35.dp)
            ) {
                Text(
                    text = "Visit our website",
                    style = TextStyle(
                        fontSize = 15.sp
                    ),
                    color = Color.White
                )

            }
        }
    }
}

@Composable
fun HomePageBackground (){
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White

    ){

    }
}

@Composable
fun HomePageHeader (){

    val poppins = FontFamily(
        Font(R.font.poppins_black , FontWeight.Black),
        Font(R.font.poppins_blackitalic , FontWeight.Black),
        Font(R.font.poppins_bold , FontWeight.Bold),
        Font(R.font.poppins_bolditalic , FontWeight.Bold),
        Font(R.font.poppins_extrabold , FontWeight.ExtraBold),
        Font(R.font.poppins_extrabolditalic , FontWeight.ExtraBold),
        Font(R.font.poppins_extralight , FontWeight.ExtraLight),
        Font(R.font.poppins_extralightitalic , FontWeight.ExtraLight),
        Font(R.font.poppins_italic , FontWeight.Normal),
        Font(R.font.poppins_light , FontWeight.Light),
        Font(R.font.poppins_lightitalic , FontWeight.Light),
        Font(R.font.poppins_medium , FontWeight.Medium),
        Font(R.font.poppins_mediumitalic , FontWeight.Medium),
        Font(R.font.poppins_regular , FontWeight.Normal),
        Font(R.font.poppins_thin , FontWeight.Thin),
        Font(R.font.poppins_thinitalic, FontWeight.Thin),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_semibolditalic, FontWeight.SemiBold)
    )
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
    ){

        Surface (//back button
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .width(80.dp)
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 20.dp
                    )
                )
        ){
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.left),
                    contentDescription = "Back button",
                    Modifier
                        .size(40.dp)

                )
            }
        }

        Surface (
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .clip(
                    RoundedCornerShape(
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    )
                )
        ){
            Text(
                text = "Home:",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                ),
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        end = 10.dp
                    )
            )
        }

        Surface (//back button
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .width(80.dp)
                .clip(
                    RoundedCornerShape(
                        bottomStart = 20.dp
                    )
                )
        ){
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Back button",
                    Modifier
                        .size(40.dp)

                )
            }
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