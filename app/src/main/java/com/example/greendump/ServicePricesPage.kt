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
fun ServicePricesPage(){
    ServicePricesBackground()
    Column (
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Tier()

            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )

            Package()
        }
        Charge()
    }
}

@Composable
fun ServicePricesBackground (){
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
fun Tier(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "Tier:",
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .padding(start = 10.dp)
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
                horizontalArrangement = Arrangement.Start,
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

                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Premium",
                        style = TextStyle(fontSize = 30.sp),
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.down_arrow),
                        contentDescription = "Dropdown Icon",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 10.dp)
                    )
                }
            }
        }

    }
}

@Composable
fun Package(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "Package:",
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .padding(start = 10.dp)
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
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Premium 1",
                        style = TextStyle(fontSize = 30.sp),
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.down_arrow),
                        contentDescription = "Dropdown Icon",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 10.dp)
                    )
                }
            }
        }

    }
}

@Composable
fun Charge(){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Charge:",
                style = TextStyle(fontSize = 30.sp)
            )

            Surface (
                modifier = Modifier,
                color = Color.White

            ){
                Text(
                    text = "Ugx. 500,000",
                    style = TextStyle(fontSize = 30.sp),
                    modifier = Modifier
                        .padding(end = 10.dp)
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
fun ServicePricesPagePreview(){
    ServicePricesPage()
}