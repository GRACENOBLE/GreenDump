package com.example.greendump

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BlogPage(){
    BlogPageBackground()
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        BlogIcon()
        Articles()
    }
}

@Composable
fun BlogPageBackground (){
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
fun BlogIcon(){
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.blog),
            contentDescription = "Blog Icon",
            modifier = Modifier
                .size(90.dp)
        )

        Text(
            text = "Blog Page:",
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .padding(start = 10.dp)
        )
    }
}

@Composable
fun Articles(){
    val images = arrayOf(
        R.drawable.kidntrash,
        R.drawable.bins,
        R.drawable.taking_out_the_trash,
        R.drawable.dump,
        R.drawable.bin_black,
        R.drawable.stations

    )

    LazyColumn{

        items(6){
            val currentImage = images[it]
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 20.dp,
                        bottom = 20.dp
                    ),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Box (
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)
                        .clip(RoundedCornerShape(20.dp))
                ){
                    Image(
                        painter = painterResource(id = currentImage),
                        contentDescription = "Kid in trash",
                        contentScale = ContentScale.Crop,
                    )
                }
                Box (
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)
                ){
                    Text(
                        text = stringResource(R.string.Lorem)
                    )
                }
            }
        }
    }


}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BlogPagePreview(){
    BlogPage()
}