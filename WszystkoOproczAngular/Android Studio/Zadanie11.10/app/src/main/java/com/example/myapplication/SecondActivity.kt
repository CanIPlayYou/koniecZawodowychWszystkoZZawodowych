package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val prevImageButton:Button = findViewById(R.id.prevImgButton)
        val nextImageButton:Button = findViewById(R.id.nextImgButton)

        val imgView:ImageView = findViewById(R.id.imgView)
        val ratingBar:RatingBar = findViewById(R.id.ratingBar1)
        val sendRateButton:Button = findViewById(R.id.sendRatingButton)
        val showRatingsWindowButton:Button = findViewById(R.id.showRatingWindowBtn)

        val intent2 = Intent(this, ThirdActivity::class.java)

        imgView.setImageResource(R.drawable.zd1)

        var licznik = 1

        prevImageButton.setOnClickListener {
            licznik--

            if(licznik == 0){
                licznik = 5
            }

            if(licznik == 1){
                imgView.setImageResource(R.drawable.zd1)
                val pickedImage = "Zdjęcie 1"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 2){
                imgView.setImageResource(R.drawable.zd2)
                val pickedImage = "Zdjęcie 2"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 3){
                imgView.setImageResource(R.drawable.zd3)
                val pickedImage = "Zdjęcie 3"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 4){
                imgView.setImageResource(R.drawable.zd4)
                val pickedImage = "Zdjęcie 4"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 5){
                imgView.setImageResource(R.drawable.zd5)
                val pickedImage = "Zdjęcie 5"

                intent2.putExtra("picked_image", pickedImage)
            }
        }

        nextImageButton.setOnClickListener {
            licznik++

            if(licznik == 6){
                licznik = 1
            }

            if(licznik == 1){
                imgView.setImageResource(R.drawable.zd1)
                val pickedImage = "Zdjęcie 1"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 2){
                imgView.setImageResource(R.drawable.zd2)
                val pickedImage = "Zdjęcie 2"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 3){
                imgView.setImageResource(R.drawable.zd3)
                val pickedImage = "Zdjęcie 3"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 4){
                imgView.setImageResource(R.drawable.zd4)
                val pickedImage = "Zdjęcie 4"

                intent2.putExtra("picked_image", pickedImage)
            }
            if(licznik == 5){
                imgView.setImageResource(R.drawable.zd5)
                val pickedImage = "Zdjęcie 5"

                intent2.putExtra("picked_image", pickedImage)
            }
        }

        sendRateButton.setOnClickListener {
            val userRate = ratingBar.rating

            intent2.putExtra("user_rate", userRate.toString())
            Toast.makeText(this, "Oceniono zdjęcie!", Toast.LENGTH_SHORT).show()
        }

        showRatingsWindowButton.setOnClickListener {
            startActivity(intent2)
        }


        }
    }



