package com.example.introtocompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.introtocompose.ui.theme.backgroundColor
import com.example.introtocompose.R
import com.example.introtocompose.ui.theme.PromoCard
import com.example.introtocompose.ui.theme.searchBorder


@Composable
fun Home() {
    val search = remember {
        mutableStateOf("")
    }
    val activeTab = rememberSaveable {
        mutableStateOf("sushi")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(20.dp)
    ) {
        Header(headerText = "Jakarta", modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(15.dp))
        PromoCard(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp), promoPercentage = 32)
        Spacer(modifier = Modifier.height(15.dp))
        TextField(
            value = search.value,
            onValueChange = { newValue->
                search.value = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = searchBorder,
                    shape = RoundedCornerShape(20)
                ),
            placeholder = { Text(text = "Search here") },
            shape = RoundedCornerShape(20),
            colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFFf9f9f9),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_search_24) , contentDescription ="" )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            MealTab(meal="sushi", active = true, modifier = Modifier.clickable {
                activeTab.value = "ramen"
            })
            Spacer(modifier = Modifier.width(20.dp))
            MealTab(meal="ramen", active = true, modifier = Modifier.clickable{
                activeTab.value = "ramen"
            })
        }
        Spacer(modifier = Modifier.height(25.dp))
        if(activeTab.value == "ramen") {
            LazyRow {
                items(Util.generateRamenItems()) { item ->
                    MealCard(
                        modifier = Modifier,
                        meal = item,
                        active = true
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }

        if(activeTab.value == "sushi") {
            LazyRow {
                items(Util.generateSushiItems()) { item ->
                    MealCard(
                        modifier = Modifier,
                        meal = item,
                        active = true
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun HomePreview(){
    Home()
}