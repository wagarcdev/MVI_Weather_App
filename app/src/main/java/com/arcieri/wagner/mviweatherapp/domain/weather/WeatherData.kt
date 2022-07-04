package com.arcieri.wagner.mviweatherapp.domain.weather

import java.time.LocalDateTime

data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windspeed: Double,
    val humidity: Double,
    val weatherType: WeatherType,
)
