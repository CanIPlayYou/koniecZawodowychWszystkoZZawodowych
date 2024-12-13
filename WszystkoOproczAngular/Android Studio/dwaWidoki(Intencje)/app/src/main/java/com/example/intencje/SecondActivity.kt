package com.example.intencje

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val otrzymaneDaneText: TextView = findViewById(R.id.otrzymaneDaneText)
        val userInput = intent.getStringExtra("user_input")

        otrzymaneDaneText.text = "Otrzymane dane: "+ userInput
    }
}