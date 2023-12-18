package com.example.greendump.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greendump.R

@ExperimentalMaterial3Api
@Composable
fun SignUp (){
    Surface (
        modifier = Modifier
            .alpha(0.5F)
    ){
        Background()
    }
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            SignUpHeader()
        }
        SignupInputFields()
        SignUpButton()
        AlternativeSignUpOptions()
    }
}

@Composable
fun SignUpHeader(){
    Text(
        text = "SIGN UP:",
        style = TextStyle(fontSize = 40.sp)
    )
}

@ExperimentalMaterial3Api
@Composable
fun SignupInputFields (){
    Column (
        modifier = Modifier
            .padding(
                start = 20.dp,
                end = 20.dp
            )
    ){
        OutlinedTextField(
            label = { Text(text = "Username") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = "Email") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = "Location Dropdown") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = "Phone Number") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = "Create Password") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = "Confirm Password") },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Composable
fun SignUpButton(){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ){
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = "SIGNUP",
                style = TextStyle(fontSize = 30.sp)
            )
        }
    }
}

@Composable
fun AlternativeSignUpOptions(){
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
                text = "Sign up with Google",
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
                text = "Sign up with Microsoft",
                style = TextStyle(fontSize = 20.sp)
            )

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SignUpPreview (){
    SignUp()
}