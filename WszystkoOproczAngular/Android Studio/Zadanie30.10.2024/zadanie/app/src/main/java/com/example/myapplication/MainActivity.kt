package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nickTextInput:EditText = findViewById(R.id.nickTextInput)
        val submitButton:Button = findViewById(R.id.applyNickBtn)

        submitButton.setOnClickListener {
            val nickInput = nickTextInput.text.toString()

            if(nickInput.isBlank()){
                Toast.makeText(this, "Nie podano nicku!", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("nick_input", nickInput)
                startActivity(intent)
            }
        }
    }
}