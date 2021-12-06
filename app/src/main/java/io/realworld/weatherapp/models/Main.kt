package io.realworld.weatherapp.models

import java.io.Serializable

data class Main(
    val temp:Double,
    val temp_min:Double,
    val humidity: Int,
    val temp_max:Double,
    val pressure:Double,
    val sea_level:Double,
    val grnd_level:Double
):Serializable