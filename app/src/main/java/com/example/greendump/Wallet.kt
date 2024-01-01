package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
    ){
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
    Surface(
        color = Color(0xFF2e8355),
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .clip(
                shape = RoundedCornerShape(
                    topEnd = 40.dp,
                    bottomEnd = 40.dp
                )
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
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

            Text(
                text = stringResource(R.string.ugx_500_000),
                style = TextStyle(fontSize = 30.sp),
                modifier = Modifier
                    .padding(end = 10.dp)
            )
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
            colors = ButtonDefaults.buttonColors(Color(0xFFAA7A00)),
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
        ) {
            Row {


                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = stringResource(R.string.add_cash),
                    style = TextStyle(fontSize = 15.sp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        TextButton(
            onClick = { /*TODO*/ },
            //colors = ButtonDefaults.buttonColors(Color(0xFFAA7A00)),
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, shape = RoundedCornerShape(40.dp), color = Color(0xFFAA7A00))
                .height(35.dp)
        ) {
            Row {
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = stringResource(R.string.remove_cash),
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color(0xFFAA7A00)
                    )
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