package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
fun PaymentMethod(
    navController: NavController
){
    PaymentMethodBackground()
    Column {
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
                    .clickable { navController.navigate(Screen.HomePage.route) }
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
                    text = "Cards:",
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

        Spacer(
            modifier = Modifier
                .height(100.dp)
        )

        PaymentMethods()
    }
}

@Composable
fun PaymentMethodBackground (){
    Surface (
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
    ){
    }
}

@Composable
fun PaymentMethods(){
    Column {
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.visa),
                    contentDescription = stringResource(R.string.visa_icon),
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "Visa",
                    style = TextStyle(fontSize = 30.sp)
                )

                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = stringResource(R.string.next),
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.card),
                    contentDescription = stringResource(R.string.mastercard_icon),
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = stringResource(R.string.mastercard),
                    style = TextStyle(fontSize = 30.sp)
                )

                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = stringResource(R.string.next),
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.mobilemoneymtn),
                    contentDescription = stringResource(R.string.mtn_mobile_money_icon),
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = "MTN Mo-Mo",
                    style = TextStyle(fontSize = 30.sp)
                )

                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = stringResource(R.string.next),
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.airtelmoney),
                    contentDescription = stringResource(R.string.airtel_money),
                    modifier = Modifier
                        .size(50.dp)
                )

                Text(
                    text = stringResource(R.string.airtel_money),
                    style = TextStyle(fontSize = 30.sp)
                )

                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = stringResource(R.string.next),
                    modifier = Modifier
                        .size(25.dp)
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
fun PaymentMethodPreview(){
    PaymentMethod(navController = rememberNavController())
}