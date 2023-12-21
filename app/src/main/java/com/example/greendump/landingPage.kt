package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LandingPage (navController: NavController){
    LandingPageBackground()
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier
                .width(270.dp)
        ){
            LandingPageHeader()
        }

        Spacer(
            modifier = Modifier
                .height(50.dp)
        )

        Icon()

        Spacer(
            modifier = Modifier
                .height(50.dp)
        )

        Row(
            modifier = Modifier
        ){

            Button(
                onClick = {
                    navController.navigate( route = Screen.SignUp.route)
                }
            ) {
                Text(
                    text = stringResource(R.string.sign_up),
                    style = TextStyle(fontSize = 30.sp)
                )
            }

            Spacer(
                modifier = Modifier
                    .width(50.dp)
            )

            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = stringResource(R.string.sign_in),
                    style = TextStyle(fontSize = 30.sp)
                )
            }
        }
    }
}

@Composable
fun LandingPageBackground (){
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
fun LandingPageHeader (){
    Text(
        text = stringResource(R.string.welcomeMessage),
        style = TextStyle(fontSize = 40.sp)
    )
}

@Composable
fun Icon (){
    Image(painter = painterResource(
        id = R.drawable.launcher_icon),
        contentDescription = stringResource(R.string.app_icon)
    )
}

@Composable
fun SignUpSignInButtons (){

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LandingPagePreview() {
    //LandingPage()

}