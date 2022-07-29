package com.example.weatherdustchecker

import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

@JsonIgnoreProperties(ignoreUnknown=true)
data class OpenDusetAPIJSONResponse(val main: Map<String, String>, val weather: List<Map<String, String>>)

private val APP_ID = ""

lateinit var weatherImage : ImageView;
lateinit var statusText : TextView;
lateinit var temperatureText : TextView;



class DustTestFragment: Fragment() {
}