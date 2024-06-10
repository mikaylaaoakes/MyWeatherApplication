package com.example.myweatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Intent
import androidx.lifecycle.ReportFragment.Companion.reportFragment

class MainActivity : AppCompatActivity() {

    private val days = ArrayList<String>()
    private val minimumTemps = ArrayList<Int>()
    private val maximumTemps = ArrayList<Int>()
    private val weatherConditions = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val minTempEditText = findViewById<EditText>(R.id.minTempEditText)
        val maxTempEditText = findViewById<EditText>(R.id.maxTempEditText)
        val weatherEditText = findViewById<EditText>(R.id.weatherEditText)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val addButton = findViewById<Button>(R.id.addButton)
        val viewButton = findViewById<Button>(R.id.viewButton)

        addButton.setOnClickListener{
            val day = dayEditText.text.toString()
            val minimumTemp = minTempEditText.text.toString().toIntOrNull()
            val maximumTemp = maxTempEditText.toString().toIntOrNull()
            val weatherCondition = weatherEditText.text.toString()

            //adding the user input stored in the variables into the arrays
            if(day.isNotEmpty() && minimumTemp !=null && maximumTemp !=null && weatherCondition.isNotEmpty()) {
                days.add(day)
                minimumTemps.add(minimumTemp)
                maximumTemps.add(maximumTemp)
                weatherConditions.add(weatherCondition)
                Toast.makeText(this, "Input Added", Toast.LENGTH_SHORT).show()
                clearFields(dayEditText, minTempEditText, maxTempEditText, weatherEditText)
            } else {
                Toast.makeText(this, "Please complete all the Input Fields", Toast.LENGTH_SHORT).show()
            }

            //code to clear array variables when delete button is clicked
            deleteButton.setOnClickListener{
                days.clear()
                minimumTemps.clear()
                maximumTemps.clear()
                weatherConditions.clear()
                Toast.makeText(this, "Input Deleted", Toast.LENGTH_SHORT).show()



            }
    }
}

    private fun clearFields(vararg fields:EditText) {
        for (field in fields) {
            field.text.clear()
        }
    }

    }
