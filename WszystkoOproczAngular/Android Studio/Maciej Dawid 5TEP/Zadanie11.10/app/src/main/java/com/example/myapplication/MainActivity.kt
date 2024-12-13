package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailEditText:EditText = findViewById(R.id.emailEditText)
        val passEditText:EditText = findViewById(R.id.passwordEditText)
        val zalogujButton:Button = findViewById(R.id.zalogujButton)
        val errMessageTextView:TextView = findViewById(R.id.errorMessageTextView)

        val intent = Intent(this, SecondActivity::class.java)

        val correctPassword = "1234"

        zalogujButton.setOnClickListener {
            if((passEditText.text).toString() == correctPassword){
                startActivity(intent)
                errMessageTextView.isVisible = false
            }else{
                errMessageTextView.text = "Błędne hasło. Spróbuj ponownie"
                errMessageTextView.isVisible = true
            }

            if((passEditText.text).toString() == ""){
                errMessageTextView.text = "Proszę wypełnić wszystkie pola"
                errMessageTextView.isVisible = true
            }
        }
    }
}