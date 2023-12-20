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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
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

@ExperimentalMaterial3Api
@Composable
fun SignUp (){
    Surface (
        modifier = Modifier
            .alpha(0.5F)
    ){
        SignUpBackground()
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
fun SignUpBackground (){
    Surface (
        modifier = Modifier
            .alpha(0.5F)
    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentScale = ContentScale.Crop,
            alpha = 0.2F,
            contentDescription = stringResource(R.string.background_image)
        )
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
            label = { Text(text = stringResource(R.string.username)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = stringResource(R.string.email)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = stringResource(R.string.location_dropdown)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = stringResource(R.string.phone_number)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = stringResource(R.string.create_password)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            label = { Text(text = stringResource(R.string.confirm_password)) },
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
                text = stringResource(R.string.signup),
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
                contentDescription = stringResource(R.string.google_icon),
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.sign_up_google),
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
                contentDescription = stringResource(R.string.microsoft_icon),
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.microsoft_sign_up),
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