package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

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

        val rzucKoscmiButton: Button = findViewById(R.id.rzucKoscButton)
        val koscImage1: ImageView = findViewById(R.id.koscImage1)
        val koscImage2: ImageView = findViewById(R.id.koscImage2)
        val koscImage3: ImageView = findViewById(R.id.koscImage3)
        val koscImage4: ImageView = findViewById(R.id.koscImage4)
        val koscImage5: ImageView = findViewById(R.id.koscImage5)
        val wynikLosowaniaText: TextView = findViewById(R.id.wynikLosowaniaText)
        val wynikGryText: TextView = findViewById(R.id.wynikGryText)
        val resetButton: Button = findViewById(R.id.resetButton)

        var tablicaZdjec = arrayOf(
            R.drawable.kosc1,
            R.drawable.kosc2,
            R.drawable.kosc3,
            R.drawable.kosc4,
            R.drawable.kosc5,
            R.drawable.kosc6
        )

        var wynikGry = 0

        rzucKoscmiButton.setOnClickListener {
            var liczba1 = Random.nextInt(1, 7)
            var liczba2 = Random.nextInt(1, 7)
            var liczba3 = Random.nextInt(1, 7)
            var liczba4 = Random.nextInt(1, 7)
            var liczba5 = Random.nextInt(1, 7)

            koscImage1.setImageResource(tablicaZdjec[liczba1-1])
            koscImage2.setImageResource(tablicaZdjec[liczba2-1])
            koscImage3.setImageResource(tablicaZdjec[liczba3-1])
            koscImage4.setImageResource(tablicaZdjec[liczba4-1])
            koscImage5.setImageResource(tablicaZdjec[liczba5-1])

            var wynik = 0

            if(liczba1 == liczba2){
                wynik += liczba1+liczba2
            }
            if(liczba1 == liczba3){
                wynik += liczba1 + liczba3
            }
            if(liczba1 == liczba4){
                wynik += liczba1 + liczba4
            }
            if(liczba1 == liczba5){
                wynik += liczba1 + liczba5
            }
            if(liczba2 == liczba3){
                wynik += liczba2 + liczba3
            }
            if(liczba2 == liczba4){
                wynik += liczba2 + liczba4
            }
            if(liczba2 == liczba5){
                wynik += liczba2 + liczba5
            }
            if(liczba3 == liczba4){
                wynik += liczba3 + liczba4
            }
            if(liczba3 == liczba5){
                wynik += liczba3 + liczba5
            }
            if(liczba4 == liczba5){
                wynik += liczba4 + liczba5
            }

            wynikGry += wynik
            wynikGryText.text = "Wynik gry: "+ wynikGry.toString()
            wynikLosowaniaText.text = "Wynik tego losowania: "+ wynik.toString()
        }

        resetButton.setOnClickListener {
            koscImage1.setImageResource(R.drawable.question)
            koscImage2.setImageResource(R.drawable.question)
            koscImage3.setImageResource(R.drawable.question)
            koscImage4.setImageResource(R.drawable.question)
            koscImage5.setImageResource(R.drawable.question)

            wynikGry = 0
            wynikGryText.text = "Wynik gry: 0"
            wynikLosowaniaText.text = "Wynik tego losowania: 0"
        }
    }
}