package com.example.myweatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dates = intent.getStringArrayListExtra("dates")?:arrayListOf()
        val days = intent.getStringArrayListExtra("days")?:arrayListOf()
        val minimumTemps = intent.getIntegerArrayListExtra("minimumTemps")?:arrayListOf()
        val maximumTemps = intent.getIntegerArrayListExtra("maximumTemps")?:arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions")?:arrayListOf()

        val viewTextView = findViewById<TextView>(R.id.viewTextView)
        val averageTempTextView = findViewById<TextView>(R.id.averageTempTextView)
        val returnButton = findViewById<Button>(R.id.returnButton)

        var totalTemp = 0
        var showText = ""
        for (i in days.indices) {
            val dailyTemp = minimumTemps[i] + maximumTemps[i]
            totalTemp += dailyTemp
            showText +="Date: ${dates[i]}, Day: ${days[i]}, Sunny/Cloudy: ${sun[i]}, Minimum: ${minimumTemps[i]}, Maximum: ${maximumTemps[i]}, Weather: ${weatherConditions[i]} "
        }

        val averageTemp = if(days.isNotEmpty() && dates.isNotEmpty())
            totalTemp / days.size else 0

        viewTextView = showText
        averageTempTextView.text = "Average Temperature: $averageTemp degrees per day"



        returnButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}