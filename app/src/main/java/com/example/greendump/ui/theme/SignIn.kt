package com.example.greendump.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.greendump.R

@Composable
fun SignIn (){
    Background()
}

@Composable
fun Background (){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentScale = ContentScale.Crop,
        alpha = 0.2F,
        contentDescription = "Background Image")
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SignInPreview () {
    SignIn()
}