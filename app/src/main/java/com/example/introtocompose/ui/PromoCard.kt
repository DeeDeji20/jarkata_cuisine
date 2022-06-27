package com.example.introtocompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.introtocompose.R

@Composable
fun PromoCard(
    modifier: Modifier,
    promoPercentage: Int =10
){
    Card(
        shape = RoundedCornerShape(20),
        modifier = modifier,

//        shape = RoundedCornerShape(30),
        elevation = 20.dp
    ) {
        Row( modifier= Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(promoColor1, promoColor2)
                )
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
           Column(
               modifier = Modifier
                   .fillMaxHeight()
                   .fillMaxWidth(.5f)
           ) {
                Text(text = "Get $promoPercentage % promo",
                    color = Color.White,
                    fontSize = 20.sp
                )
               Spacer(modifier = Modifier.height(10.dp))
               Button(onClick = { /*TODO*/ },
                    shape= RoundedCornerShape(40),
                   colors = ButtonDefaults.buttonColors(
                       contentColor = Color(0xFFffedf0),
                       backgroundColor = Color(0xFFbe6467)
                           .copy(alpha = .8f)
                   )
               ) {
                   Text(text = "Buy food",

                   )
               }
           }
            Image(painter = painterResource(id = R.drawable.prawn2), contentDescription = "")
        }
    }
}