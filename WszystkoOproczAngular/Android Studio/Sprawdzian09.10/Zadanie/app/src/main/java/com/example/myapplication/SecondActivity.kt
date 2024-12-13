package com.example.myapplication

import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.SeekBar
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

        val seekBar1:SeekBar = findViewById(R.id.skBar)
        val imgView:ImageView = findViewById(R.id.imgView)
        val saveButton:Button = findViewById(R.id.zapiszButton)
        val lstView:ListView = findViewById(R.id.listView)

        saveButton.setOnClickListener {
            if(seekBar1.progress == 1){
                imgView.setImageResource(R.drawable.start)
            }
            if(seekBar1.progress == 2){
                imgView.setImageResource(R.drawable.zd1)
            }
            if(seekBar1.progress == 3){
                imgView.setImageResource(R.drawable.zd2)
            }
            if(seekBar1.progress == 4){
                imgView.setImageResource(R.drawable.zd3)
            }
            if(seekBar1.progress == 5){
                imgView.setImageResource(R.drawable.zd4)
            }


        }
    }
}


