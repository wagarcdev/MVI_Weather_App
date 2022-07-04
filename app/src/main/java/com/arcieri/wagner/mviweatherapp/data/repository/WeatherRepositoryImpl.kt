package com.arcieri.wagner.mviweatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.arcieri.wagner.mviweatherapp.data.mappers.toWeatherInfo
import com.arcieri.wagner.mviweatherapp.data.remote.WeatherAPI
import com.arcieri.wagner.mviweatherapp.domain.repository.WeatherRepository
import com.arcieri.wagner.mviweatherapp.domain.util.Resource
import com.arcieri.wagner.mviweatherapp.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor (
    private val api: WeatherAPI
): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lng = lng
                ).toWeatherInfo()
            )

        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "Unknown error occurred.")
        }

    }
}