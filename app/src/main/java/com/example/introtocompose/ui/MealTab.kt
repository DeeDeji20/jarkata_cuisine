package com.example.introtocompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.introtocompose.R

@Composable
fun MealTab(
    meal: String = "sushi",
    active: Boolean= false,
    modifier: Modifier

){
    Card(
       modifier = modifier
           .width(120.dp)
           .height(50.dp),
    shape = RoundedCornerShape(30)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    if (active) {
                        androidx.compose.ui.graphics.Color.White
                    } else {
                        Color(0xFFf5f5f5)
                    }
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(
                id = if (meal == "sushi"){
                    R.drawable.sushsi2
                }else R.drawable.ramen2
            
            ), contentDescription ="" )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = meal)
        }
    }
}