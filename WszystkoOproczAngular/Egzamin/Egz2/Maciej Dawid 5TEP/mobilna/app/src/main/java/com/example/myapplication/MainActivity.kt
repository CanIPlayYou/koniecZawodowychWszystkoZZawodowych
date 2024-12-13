package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val lista:MutableList<String> = mutableListOf()
    lateinit var adapter: ArrayAdapter<String>;

    val listaElementow:MutableList<String> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnDodaj:Button = findViewById(R.id.btnDodaj)
        val nowyElementText:EditText = findViewById(R.id.nowyElementText)
        val listView:ListView = findViewById(R.id.listView)

        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter

        listaElementow.add("Zakupy: chleb, masło, ser")
        listaElementow.add("Do zrobienia: obiad, umyć podłogi")
        listaElementow.add("weekend: kino, spacer z psem")

        adapter.add(listaElementow[0])
        adapter.add(listaElementow[1])
        adapter.add(listaElementow[2])

        var licznik = 2

        btnDodaj.setOnClickListener {
            val wprowadzonyText = nowyElementText.text.toString()

            listaElementow.add(wprowadzonyText)

            licznik++
            adapter.add(listaElementow[licznik])
        }
    }

}