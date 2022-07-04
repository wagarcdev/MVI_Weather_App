package com.arcieri.wagner.mviweatherapp.domain.repository

import com.arcieri.wagner.mviweatherapp.domain.util.Resource
import com.arcieri.wagner.mviweatherapp.domain.weather.WeatherInfo

interface WeatherRepository {


    suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo>

}