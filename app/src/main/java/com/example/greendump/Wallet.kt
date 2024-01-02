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


@Composable
fun WalletPage(){
    WalletPageBackground()
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .fillMaxSize()
    ){
        WalletPageHeader()

        Spacer(
            modifier = Modifier
                .height(200.dp)
        )

        DisplayCash()

        Spacer(
            modifier = Modifier
                .height(100.dp)
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
fun WalletPageHeader (){

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
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
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
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    )
                )
        ){
            Text(
                text = "Wallet:",
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

        Surface (//back button
            color = Color(0xFF2e8355),
            modifier = Modifier
                .fillMaxHeight()
                .width(80.dp)
                .clip(
                    RoundedCornerShape(
                        bottomStart = 20.dp
                    )
                )
        ){
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Back button",
                    Modifier
                        .size(40.dp)

                )
            }
        }
    }
}



@Composable
fun DisplayCash(){
    Surface(
        color = Color(0xFF2e8355),
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(end = 20.dp)
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