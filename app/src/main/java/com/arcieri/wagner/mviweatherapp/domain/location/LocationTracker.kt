package com.arcieri.wagner.mviweatherapp.domain.location

import android.location.Location
import com.arcieri.wagner.mviweatherapp.domain.util.Resource

interface LocationTracker {

    suspend fun getCurrentLocation(): Resource<Location>

}