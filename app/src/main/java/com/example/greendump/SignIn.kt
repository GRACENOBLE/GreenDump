package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SignIn (navController: NavController){
    SignInBackground()
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            SignInHeader()
        }
        Box {
            Form()

            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Button(
                        onClick = { navController.navigate(route = Screen.HomePage.route)
                        },
                        colors = ButtonDefaults
                            .buttonColors(Color(0xFFAA7A00)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = 20.dp,
                                end = 20.dp
                            )
                            .height(35.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.login),
                            style = TextStyle(fontSize = 15.sp),
                            color = Color.White
                        )

                    }
                }
            }
        }
    }
}

@Composable
fun SignInBackground (){
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ){

    }
}

@Composable
fun SignInHeader(){
    val poppins = FontFamily(
        Font(R.font.poppins_black , FontWeight.Black),
        Font(R.font.poppins_blackitalic , FontWeight.Black),
        Font(R.font.poppins_bold , FontWeight.Bold),
        Font(R.font.poppins_bolditalic , FontWeight.Bold),
        Font(R.font.poppins_extrabold , FontWeight.ExtraBold),
        Font(R.font.poppins_extrabolditalic , FontWeight.ExtraBold),
        Font(R.font.poppins_extralight , FontWeight.ExtraLight),
        Font(R.font.poppins_extralightitalic , FontWeight.ExtraLight),
        Font(R.font.poppins_italic , FontWeight.Normal),
        Font(R.font.poppins_light , FontWeight.Light),
        Font(R.font.poppins_lightitalic , FontWeight.Light),
        Font(R.font.poppins_medium , FontWeight.Medium),
        Font(R.font.poppins_mediumitalic , FontWeight.Medium),
        Font(R.font.poppins_regular , FontWeight.Normal),
        Font(R.font.poppins_thin , FontWeight.Thin),
        Font(R.font.poppins_thinitalic, FontWeight.Thin),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_semibolditalic, FontWeight.SemiBold)
    )
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ){

        Surface (//back button
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .width(80.dp)
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 20.dp
                    )
                )
        ){
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.left),
                    contentDescription = "Back button",
                    Modifier
                        .size(40.dp)

                )
            }
        }

        Surface (
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .clip(
                    RoundedCornerShape(
                        bottomStart = 20.dp
                    )
                )
        ){
            Text(
                text = "Sign In:",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                ),
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        end = 10.dp
                    )
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form () {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ){
        InputFields()

        LoginButton()

        AlternativeSignInOptions()
    }
}

@ExperimentalMaterial3Api
@Composable
fun InputFields(){
    Surface (
        modifier = Modifier
            .padding(end = 30.dp)
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 20.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 20.dp
                )
            )
            ,
        color = Color(0xFF2e8355)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                label = {
                    Text(
                        text = stringResource(id = R.string.username),
                        color = Color.White
                    )
                },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )

            OutlinedTextField(
                label = {
                    Text(
                        text = stringResource(R.string.password),
                        color = Color.White
                    )
                },
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
            )
        }
    }

}

@Composable
fun LoginButton(){
    
}

@Composable
fun AlternativeSignInOptions(){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
                .border(
                    width = 1.dp,
                    color = Color(0xFF2e8355),
                    shape = RoundedCornerShape(40.dp)
                )
                .height(35.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = stringResource(id = R.string.google_icon),
                modifier = Modifier
                    .size(20.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.google_sign_in),
                style = TextStyle(fontSize = 15.sp),
                color = Color(0xFF2e8355)
            )

        }

        Spacer(
            modifier = Modifier
                .height(20.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
                .height(35.dp),
            colors =ButtonDefaults.buttonColors(Color(0xFF2e8355))
        ) {

            Image(
                painter = painterResource(id = R.drawable.microsoft),
                contentDescription = stringResource(id = R.string.microsoft_icon),
                modifier = Modifier
                    .size(20.dp),
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.sign_in_microsoft),
                style = TextStyle(fontSize = 15.sp)
            )

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SignInPreview () {
    SignIn(navController = rememberNavController())
}