package com.example.introtocompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.introtocompose.R

@Composable
fun MealCard(
    modifier: Modifier,
    meal: Meal,
    active: Boolean
){
    Card(
        modifier = modifier
            .width(200.dp)
            .height(230.dp),
        shape = RoundedCornerShape(20),
        elevation = 20.dp
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 10.dp)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.ic_baseline_favorite_border_24),
                contentDescription = "",
                modifier = modifier.align(Alignment.End)
                )
            Spacer(modifier = Modifier.height(10.dp))
            
            
         Column(
             modifier = Modifier.fillMaxSize(),
             horizontalAlignment = Alignment.Start
             
         ) {
            Box(modifier = Modifier.fillMaxHeight(.5f)){
                Image(painter = painterResource(id = R.drawable.sushsi2),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )
            }
             Spacer(modifier = Modifier.height(10.dp))
             Text(text = meal.name)
             Spacer(modifier = Modifier.height(10.dp))
             Row(
                 modifier = Modifier.fillMaxWidth()
             ) {
                Text(text = "$ ${meal.price}")
                 Text(text = meal.rating.toString())
             }
         }
        }
    }
}