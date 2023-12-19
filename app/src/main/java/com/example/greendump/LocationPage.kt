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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LocationPage(){
    LocationPageBackground()
    Column (
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
    ){
        LocationIcon()
        LocationText()
        Map()
        ConfirmButton()
    }
}

@Composable
fun LocationPageBackground (){
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
fun LocationIcon(){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = R.drawable.google_maps),
            contentDescription = "Google maps icon",
            modifier = Modifier
                .size(80.dp)
        )
    }
}

@Composable
fun LocationText(){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "Select Pickup \n Point",
            style = TextStyle(fontSize = 30.sp)
        )
    }
}

@Composable
fun Map(){
    Image(
        painter = painterResource(id = R.drawable.map),
        contentDescription = "Map place holder",
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 20.dp,
                end = 20.dp,
                bottom = 50.dp
            )
            .height(400.dp),
        contentScale = ContentScale.Crop

    )
}

@Composable
fun ConfirmButton(){
    Row (
        horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(
                    end = 10.dp,
                    bottom = 70.dp
                )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.confirmation),
                    contentDescription = "confirm icon",
                    modifier = Modifier
                        .size(30.dp)
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = "Confirm",
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
fun LocationPagePreview(){
    LocationPage()
}