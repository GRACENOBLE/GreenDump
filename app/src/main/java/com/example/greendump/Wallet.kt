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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun WalletPage(){
    WalletPageBackground()
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .fillMaxSize()
    ){
        WalletIcon()

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        DisplayCash()

        Spacer(
            modifier = Modifier
                .height(200.dp)
        )

        CashButtons()
    }
}
@Composable
fun WalletPageBackground (){
    Surface (
        modifier = Modifier
            .alpha(0.5F)
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
fun WalletIcon(){
    Image(
        painter = painterResource(R.drawable.wallet),
        contentDescription = stringResource(R.string.wallet_icon),
        modifier = Modifier
            .size(80.dp)
            .padding(top = 20.dp)
    )
}

@Composable
fun DisplayCash(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = stringResource(R.string.balance),
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
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = stringResource(R.string.ugx_500_000),
                    style = TextStyle(fontSize = 30.sp),
                    modifier = Modifier
                        .padding(end = 10.dp)
                )
            }
        }
    }
}

@Composable
fun CashButtons(){
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
                Image(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = stringResource(R.string.add_cash_icon),
                    modifier = Modifier
                        .size(50.dp)
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = stringResource(R.string.add_cash),
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
                Image(
                    painter = painterResource(id = R.drawable.minus),
                    contentDescription = stringResource(R.string.remove_cash_icon),
                    modifier = Modifier
                        .size(50.dp)
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = stringResource(R.string.remove_cash),
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
fun WalletPagePreview(){
    WalletPage()
}