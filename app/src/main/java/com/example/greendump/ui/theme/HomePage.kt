package com.example.greendump.ui.theme

import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greendump.R


@Composable
fun HomePage(){
    HomePageBackground()
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        HomePageHeader()
        GridMenu()
    }
}

@Composable
fun HomePageBackground (){
    Surface (
        modifier = Modifier
            .alpha(0.5F)
    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentScale = ContentScale.Crop,
            alpha = 0.2F,
            contentDescription = "Background Image"
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
            contentDescription = "Back Button")

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
                contentDescription = "Profile Icon"
            )

            Text(text = "Account")
        }
    }
}

@Composable
fun GridMenu (){
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
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.pick_up),
                        contentDescription = "Pickup Icon"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Schedule\nPickup",
                        style = TextStyle(fontSize = fontSize)
                    )
                }
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.wallet),
                        contentDescription = "Wallet"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Wallet",
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
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.subscription),
                        contentDescription = "Subscription"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Subscription\nPlan",
                        style = TextStyle(fontSize = fontSize)
                    )
                }
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.debit_card),
                        contentDescription = "Payment methods"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Payment\nMethods",
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
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.price_list),
                        contentDescription = "Service prices"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Our Service\nPrices",
                        style = TextStyle(fontSize = fontSize)
                    )
                }
            }
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(buttonRounding),
                modifier = Modifier.size(width = 170.dp, height = 200.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        modifier = Modifier
                            .size(120.dp),
                        painter = painterResource(id = R.drawable.blog),
                        contentDescription = "Our blog"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Our Blog",
                        style = TextStyle(fontSize = fontSize)
                    )
                }
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
    HomePage()
}