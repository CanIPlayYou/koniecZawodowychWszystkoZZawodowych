package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_activity)

        val userNick = intent.getStringExtra("nick_input")

        val fragment = fragmentGra()
        val bundle = Bundle()
        bundle.putString("user_nick", userNick)
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit()

    }
}