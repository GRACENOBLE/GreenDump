package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubscriptionPlanPage(){
    SubscriptionPlanPageBackground()
    Column (
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Plan()

            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )

            Expiry()
        }

        TopUpButtons()
    }
}

@Composable
fun SubscriptionPlanPageBackground (){
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
fun Plan(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "Plan:",
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .padding(start = 40.dp)
        )

        Spacer(
            modifier = Modifier
                .width(50.dp)
        )

        Surface (
            modifier = Modifier,
            color = Color.White

        ){
            Row (
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.premium),
                    contentDescription = "Premium Icon",
                    modifier = Modifier
                        .size(50.dp)
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = "Premium",
                    style = TextStyle(fontSize = 30.sp),
                    modifier = Modifier
                        .padding(end = 40.dp)
                )
            }
        }
    }
}

@Composable
fun Expiry(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "Expiry:",
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .padding(start = 40.dp)
        )

        Spacer(
            modifier = Modifier
                .width(50.dp)
        )

        Surface (
            modifier = Modifier,
            color = Color.White

        ){
            Row (
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){


                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = "12/12/23",
                    style = TextStyle(fontSize = 30.sp),
                    modifier = Modifier
                        .padding(end = 40.dp)
                )
            }
        }
    }
}

@Composable
fun TopUpButtons(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 20.dp,
                end = 20.dp,
            )
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row {

                Text(
                    text = "Change Subscription",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row {


                Text(
                    text = "Renew Subscription",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row {

                Text(
                    text = "Extend Subscription",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row {

                Text(
                    text = "Cancel Subscription",
                    style = TextStyle(fontSize = 30.sp)
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
fun SubscriptionPlanPagePreview(){
    SubscriptionPlanPage()
}