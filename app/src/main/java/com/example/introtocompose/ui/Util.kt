package com.example.introtocompose.ui


object Util {
    fun generateSushiItems(): List<Meal>{
        return listOf(
            Meal("Original sushi", 21.0, 4.8),
            Meal("Shrimp sushi", 87.0, 2.8),
            Meal("Boli sushi", 201.0, 4.0),
            Meal("Mushu sushi", 11.0, 5.8),
            Meal("Crocker sushi", 210.0, 4.8),
            Meal("Titus sushi", 10.0, 2.5),
            Meal("Salmon sushi", 20.0, 2.8)
        )
    }

    fun generateRamenItems(): List<Meal>{
        return listOf(
            Meal("Original ramen", 21.0, 4.8),
            Meal("Shrimp ramen", 87.0, 2.8),
            Meal("Boli ramen", 201.0, 4.0),
            Meal("Mushu ramen", 11.0, 5.8),
            Meal("Crocker ramen", 210.0, 4.8),
            Meal("Titus ramen", 10.0, 2.5),
            Meal("Salmon ramen", 20.0, 2.8)
        )
    }

}

data class Meal(
    val name: String,
    val price: Double,
    val rating: Double,
    val isFav: Boolean= false
)