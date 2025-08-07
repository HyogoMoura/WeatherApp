package com.weatherapp.model

import com.google.android.gms.maps.model.LatLng

data class City(
    val name : String,
    var weather: Weather? = null,
    val location: LatLng? = null
)