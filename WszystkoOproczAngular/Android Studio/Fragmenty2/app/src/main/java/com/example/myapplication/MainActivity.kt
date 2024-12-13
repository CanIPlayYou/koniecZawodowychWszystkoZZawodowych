package com.example.myapplication

import android.os.Bundle
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

        val txtView : TextView = findViewById(R.id.textViewResult)
        val messageFromMainActivity = "Dane z MainActivity"

        //Przesyłanie z MainActivity do fragmentu
        val fragmentFirst = FragmentFirst().apply {
            arguments = Bundle().apply {
                putString("message_activity", messageFromMainActivity)
            }
        }

        //Odbieranie danych z fragmentu
        supportFragmentManager.setFragmentResultListener("KeyFragment", this){key, bundle ->
            val result = bundle.getString("message")
            txtView.text = result
            Toast.makeText(this, "Otrzymano dane : ${result}", Toast.LENGTH_LONG).show()
        }

        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, fragmentFirst).commit()
     //^^ Jeśli nie przesyłamy danych z MainActivity do fragmentu to zamiast ^"fragmentFirst" wpisujemy "FragmentFirst()"
    }
}