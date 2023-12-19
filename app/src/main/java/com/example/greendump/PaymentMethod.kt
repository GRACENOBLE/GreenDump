package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaymentMethod(){
    PaymentMethodBackground()
    Column {
        PaymentHeading()
        PaymentMethods()
    }
}

@Composable
fun PaymentMethodBackground (){
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
fun PaymentHeading(){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = "SELECT PAYMENT\nMETHOD:",
            style = TextStyle(fontSize = 30.sp)
        )
    }
}

@Composable
fun PaymentMethods(){
    Column {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.visa),
                    contentDescription = "Visa Icon",
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "Visa",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.card),
                    contentDescription = "Mastercard Icon",
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "Mastercard",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.mobilemoneymtn),
                    contentDescription = "MTN Mobile Money Icon",
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "MTN Mobile Money",
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.airtelmoney),
                    contentDescription = "Airtel money",
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "Airtel money",
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
fun PaymentMethodPreview(){
    PaymentMethod()
}