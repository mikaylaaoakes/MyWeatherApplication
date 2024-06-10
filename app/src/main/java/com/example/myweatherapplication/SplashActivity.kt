package com.example.myweatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val mainButton = findViewById<Button>(R.id.mainButton)
        val closeButton = findViewById<Button>(R.id.closeButton)

        closeButton.setOnClickListener {
            finish()
        }
        //code to take the user to the next page when clicking on the Main screen button
        mainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}