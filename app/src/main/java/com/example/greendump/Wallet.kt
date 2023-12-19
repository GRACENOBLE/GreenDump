package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun WalletPage(){
    WalletPageBackground()
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .fillMaxSize()
    ){
        WalletIcon()
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
            contentDescription = "Background Image"
        )
    }
}

@Composable
fun WalletIcon(){
    Image(
        painter = painterResource(R.drawable.wallet),
        contentDescription = "Wallet Icon",
        modifier = Modifier
            .size(80.dp)
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun WalletPagePreview(){
    WalletPage()
}