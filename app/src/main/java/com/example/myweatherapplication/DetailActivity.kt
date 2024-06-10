package com.example.myweatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dates = intent.getStringArrayListExtra("dates")?:arrayListOf()
        val days = intent.getStringArrayListExtra("days")?:arrayListOf()
        val sun = intent.getStringArrayListExtra("sun")?:arrayListOf()
        val minimumTemps = intent.getIntegerArrayListExtra("minimumTemps")?:arrayListOf()
        val maximumTemps = intent.getIntegerArrayListExtra("maximumTemps")?:arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions")?:arrayListOf()

        val viewTextView = findViewById<TextView>(R.id.viewTextView)
        val averageTempTextView = findViewById<TextView>(R.id.averageTempTextView)
        val returnButton = findViewById<Button>(R.id.returnButton)

    }
}