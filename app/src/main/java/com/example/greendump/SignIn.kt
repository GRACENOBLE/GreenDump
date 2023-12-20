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

@Composable
fun SignIn (){
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
        Form()
    }
}

@Composable
fun SignInBackground (){
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
fun SignInHeader(){
    Text(
        text = stringResource(R.string.sign_in_header),
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
        OutlinedTextField(
            label = { Text(text = stringResource(id = R.string.username)) },
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        OutlinedTextField(
            label = { Text(text = stringResource(R.string.password)) },
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
                text = stringResource(R.string.login),
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
                contentDescription = stringResource(id = R.string.google_icon),
                modifier = Modifier
                    .size(25.dp)
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.google_sign_in),
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
                contentDescription = stringResource(id = R.string.microsoft_icon),
                modifier = Modifier
                    .size(25.dp),
            )

            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

            Text(
                text = stringResource(R.string.sign_in_microsoft),
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