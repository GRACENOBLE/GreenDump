package com.example.greendump.ui.theme

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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greendump.R

@Composable
fun SignIn (){
    Background()
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Header()
        }
        Form()
    }
}

@Composable
fun Background (){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentScale = ContentScale.Crop,
        alpha = 0.2F,
        contentDescription = "Background Image")
}

@Composable
fun Header(){
    Text(
        text = "SIGN IN:",
        style = TextStyle(fontSize = 40.sp)
    )
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
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 20.dp,
                end = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            label = { Text(text = "Username") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        TextField(
            label = { Text(text = "Password") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }

}

@Composable
fun LoginButton(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp),
        horizontalArrangement = Arrangement.End
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(
                text = "LOGIN",
                style = TextStyle(fontSize = 30.sp)
            )

        }
    }
}

@Composable
fun AlternativeSignInOptions(){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )

        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "The google Icon",
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = "Sign in with Google",
                style = TextStyle(fontSize = 20.sp)
            )

        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {

            Image(
                painter = painterResource(id = R.drawable.microsoft),
                contentDescription = "The google Icon",
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = "Sign in with Microsoft",
                style = TextStyle(fontSize = 20.sp)
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
    SignIn()
}