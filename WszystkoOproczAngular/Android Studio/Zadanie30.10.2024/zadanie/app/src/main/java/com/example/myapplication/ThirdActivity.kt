package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.third_activity)

        val lista:MutableList<String> = mutableListOf()
        lateinit var adapter: ArrayAdapter<String>;


        val tablicaWynikowText:TextView = findViewById(R.id.tablicaWynikowText)
        val listView: ListView = findViewById(R.id.list_item)

        val userNick = intent.getStringExtra("user_nick")
        val userPoints = intent.getStringExtra("user_points")


        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter


        adapter.add("Nick gracza: "+ userNick +", pkt: "+ userPoints)
    }




}