package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewCard: ImageView
    private lateinit var buttonDraw: Button
    private lateinit var listViewCards: ListView

    private val cardImages = listOf(
        R.drawable.card_2_of_clubs,
        R.drawable.card_3_of_clubs,
        R.drawable.card_4_of_clubs,
        R.drawable.card_5_of_clubs,
        R.drawable.card_6_of_clubs,
        R.drawable.card_7_of_clubs,
        R.drawable.card_8_of_clubs,
        R.drawable.card_9_of_clubs,
        R.drawable.card_10_of_clubs,
        R.drawable.card_jack_of_clubs,
        R.drawable.card_queen_of_clubs,
        R.drawable.card_king_of_clubs,
        R.drawable.card_2_of_hearts,
        R.drawable.card_3_of_hearts,
        R.drawable.card_4_of_hearts,
        R.drawable.card_5_of_hearts,
        R.drawable.card_6_of_hearts,
        R.drawable.card_7_of_hearts,
        R.drawable.card_8_of_hearts,
        R.drawable.card_9_of_hearts,
        R.drawable.card_10_of_hearts,
        R.drawable.card_jack_of_hearts,
        R.drawable.card_queen_of_hearts,
        R.drawable.card_king_of_hearts,
        R.drawable.card_ace_of_hearts,
        R.drawable.card_2_of_spades,
        R.drawable.card_3_of_spades,
        R.drawable.card_4_of_spades,
        R.drawable.card_5_of_spades,
        R.drawable.card_6_of_spades,
        R.drawable.card_7_of_spades,
        R.drawable.card_8_of_spades,
        R.drawable.card_9_of_spades,
        R.drawable.card_10_of_spades,
        R.drawable.card_jack_of_spades,
        R.drawable.card_queen_of_spades,
        R.drawable.card_king_of_spades,
        R.drawable.card_ace_of_spades,
        R.drawable.card_2_of_diamonds,
        R.drawable.card_3_of_diamonds,
        R.drawable.card_4_of_diamonds,
        R.drawable.card_5_of_diamonds,
        R.drawable.card_6_of_diamonds,
        R.drawable.card_7_of_diamonds,
        R.drawable.card_8_of_diamonds,
        R.drawable.card_9_of_diamonds,
        R.drawable.card_10_of_diamonds,
        R.drawable.card_jack_of_diamonds,
        R.drawable.card_queen_of_diamonds,
        R.drawable.card_king_of_diamonds,
        R.drawable.card_ace_of_diamonds,
    )

    private val cardNames = listOf(
        "2 trefl",
        "3 trefl",
        "4 trefl",
        "5 trefl",
        "6 trefl",
        "7 trefl",
        "8 trefl",
        "9 trefl",
        "10 trefl",
        "jopek trefl",
        "dama trefl",
        "król trefl",
        "2 kier",
        "3 kier",
        "4 kier",
        "5 kier",
        "6 kier",
        "7 kier",
        "8 kier",
        "9 kier",
        "10 kier",
        "jopek kier",
        "dama kier",
        "król kier",
        "as kier",
        "2 pik",
        "3 pik",
        "4 pik",
        "5 pik",
        "6 pik",
        "7 pik",
        "8 pik",
        "9 pik",
        "10 pik",
        "jopek pik",
        "dama pik",
        "król pik",
        "as pik",
        "2 karo",
        "3 karo",
        "4 karo",
        "5 karo",
        "6 karo",
        "7 karo",
        "8 karo",
        "9 karo",
        "10 karo",
        "jopek karo",
        "dama karo",
        "król karo",
        "as karo"
    )

    private val drawnCards = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageViewCard = findViewById(R.id.imageViewCard)
        buttonDraw = findViewById(R.id.buttonDraw)
        listViewCards = findViewById(R.id.listViewCards)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, drawnCards)
        listViewCards.adapter = adapter

        buttonDraw.setOnClickListener {
            val randomIndex = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage = cardImages[randomIndex]
            val selectedCardName = cardNames[randomIndex]

            imageViewCard.setImageResource(selectedCardImage)
            drawnCards.add(selectedCardName)
            adapter.notifyDataSetChanged()
        }
    }
}