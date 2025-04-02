package com.example.mealsuggestions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)

        suggestButton.setOnClickListener {
            val time = timeInput.text.toString().trim().lowercase()
            var mealSuggestion: String? = null

            if (time == "morning") {
                mealSuggestion = "Breakfast: Cereal"
            } else if (time == "mid-morning") {
                mealSuggestion = "Light Snack: Energy Bar"
            } else if (time == "afternoon") {
                mealSuggestion = "Lunch: Butter Chicken"
            } else if (time == "mid-afternoon") {
                mealSuggestion = "Snack: Tea and Biscuits"
            } else if (time == "evening") {
                mealSuggestion = "Supper: Any Sandwich"
            } else if (time == "night") {
                mealSuggestion = "Dessert/Snack: Potato Chips or Sweets"
            }

            if (mealSuggestion != null) {
                suggestionText.text = mealSuggestion
            } else {
                Toast.makeText(this, "Invalid input! Enter a valid time.", Toast.LENGTH_SHORT).show()
            }
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            suggestionText.text = ""
        }
    }
}
