package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LandingPage (navController: NavController){
    LandingPageBackground()
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
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
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){

            Button(
                onClick = {
                    navController.navigate( route = Screen.SignUp.route)
                },
                modifier =Modifier
                    .padding(start = 20.dp)
            ) {
                Text(
                    text = stringResource(R.string.sign_up),
                    style = TextStyle(fontSize = 30.sp)
                )
            }



            Button(
                onClick = {
                    navController.navigate( route = Screen.SignIn.route)
                },
                modifier =Modifier
                    .padding(end = 20.dp)
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

    val cornerShape = RoundedCornerShape(
        topStart = 0.dp,
        topEnd = 0.dp,
        bottomStart = 120.dp,
        bottomEnd = 120.dp,
    )

    Surface (
        modifier  = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(cornerShape),
        color = Color(0xFF2e8355)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ){
            Box (
                modifier = Modifier
                    .height(230.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.recycle_icon),
                    contentDescription = stringResource(R.string.recycle_icon),
                    modifier = Modifier
                        .size(200.dp)
                        .align(alignment = Alignment.TopCenter)
                )

                Row (
                    modifier = Modifier
                        .align(alignment = Alignment.BottomCenter)

                ){
                    Text(
                        text = "GREEN",
                        style = TextStyle(
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                    Spacer(
                        modifier = Modifier
                            .width(10.dp)
                    )
                    Text(
                        text = "DUMP",
                        style = TextStyle(
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Icon (){
    Image(painter = painterResource(
        id = R.drawable.launcher_icon),
        contentDescription = stringResource(R.string.app_icon)
    )
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LandingPagePreview() {
    LandingPage(navController = rememberNavController())

}