package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewCard: ImageView
    private lateinit var imageViewCard2: ImageView
    private lateinit var imageViewCard3: ImageView
    private lateinit var imageViewCard4: ImageView
    private lateinit var imageViewCard5: ImageView
    private lateinit var buttonDraw: Button
    private lateinit var iloscPunktowText: TextView
    private lateinit var ukladText: TextView
    private lateinit var wynikGryText: TextView

    var bonusPoints = 0

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

    private val cardPoints = listOf(
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        1,

    )

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
        imageViewCard2 = findViewById(R.id.imageViewCard2)
        imageViewCard3 = findViewById(R.id.imageViewCard3)
        imageViewCard4 = findViewById(R.id.imageViewCard4)
        imageViewCard5 = findViewById(R.id.imageViewCard5)
        buttonDraw = findViewById(R.id.buttonDraw)
        iloscPunktowText = findViewById(R.id.iloscPunktowText)
        ukladText = findViewById(R.id.ukladText)
        wynikGryText = findViewById(R.id.wynikGryText)

        buttonDraw.setOnClickListener {
            val randomIndex = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage = cardImages[randomIndex]
            val selectedCardName = cardNames[randomIndex]
            val selectedCardPoints = cardPoints[randomIndex]

            val randomIndex2 = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage2 = cardImages[randomIndex2]
            val selectedCardName2 = cardNames[randomIndex2]
            val selectedCardPoints2 = cardPoints[randomIndex2]

            val randomIndex3 = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage3 = cardImages[randomIndex3]
            val selectedCardName3 = cardNames[randomIndex3]
            val selectedCardPoints3 = cardPoints[randomIndex3]

            val randomIndex4 = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage4 = cardImages[randomIndex4]
            val selectedCardName4 = cardNames[randomIndex4]
            val selectedCardPoints4 = cardPoints[randomIndex4]

            val randomIndex5 = Random.nextInt(cardImages.size) //size że ilość zasobów w liście
            val selectedCardImage5 = cardImages[randomIndex5]
            val selectedCardName5 = cardNames[randomIndex5]
            val selectedCardPoints5 = cardPoints[randomIndex5]

            imageViewCard.setImageResource(selectedCardImage)
            imageViewCard2.setImageResource(selectedCardImage2)
            imageViewCard3.setImageResource(selectedCardImage3)
            imageViewCard4.setImageResource(selectedCardImage4)
            imageViewCard5.setImageResource(selectedCardImage5)

            iloscPunktowText.text = "Ilość punktów: "+ (selectedCardPoints + selectedCardPoints2 + selectedCardPoints3 + selectedCardPoints4 + selectedCardPoints5).toString()


            if(selectedCardPoints == selectedCardPoints2 || selectedCardPoints == selectedCardPoints3 || selectedCardPoints == selectedCardPoints4 || selectedCardPoints == selectedCardPoints5 || selectedCardPoints2 == selectedCardPoints3 || selectedCardPoints2 == selectedCardPoints4 || selectedCardPoints2 == selectedCardPoints5 || selectedCardPoints3 == selectedCardPoints4 || selectedCardPoints3 == selectedCardPoints5 || selectedCardPoints4 == selectedCardPoints5){
                ukladText.text = "Układ kart: para"
                bonusPoints = 5
            }
            else{
                ukladText.text = "Układ kart: brak"
                bonusPoints = 0
            }

            wynikGryText.text = "Wynik Gry: "+ ((selectedCardPoints + selectedCardPoints2 + selectedCardPoints3 + selectedCardPoints4 + selectedCardPoints5)+bonusPoints).toString()


        }
    }
}