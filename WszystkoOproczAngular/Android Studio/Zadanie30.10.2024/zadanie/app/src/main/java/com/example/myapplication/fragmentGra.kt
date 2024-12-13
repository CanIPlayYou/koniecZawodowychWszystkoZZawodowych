package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmentGra.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentGra : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var rzucKoscmiButton: Button
    private lateinit var koscImage1: ImageView
    private lateinit var koscImage2: ImageView
    private lateinit var koscImage3: ImageView
    private lateinit var koscImage4: ImageView
    private lateinit var koscImage5: ImageView
    private lateinit var wynikLosowaniaText: TextView
    private lateinit var wynikGryText: TextView
    private lateinit var resetButton: Button

    private lateinit var showBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_gra, container, false)

        rzucKoscmiButton = view.findViewById<View>(R.id.rzucKoscButton) as Button
        koscImage1 = view.findViewById<View>(R.id.koscImage1) as ImageView
        koscImage2 = view.findViewById<View>(R.id.koscImage2) as ImageView
        koscImage3 = view.findViewById<View>(R.id.koscImage3) as ImageView
        koscImage4 = view.findViewById<View>(R.id.koscImage4) as ImageView
        koscImage5 = view.findViewById<View>(R.id.koscImage5) as ImageView
        wynikLosowaniaText = view.findViewById<View>(R.id.wynikLosowaniaText) as TextView
        wynikGryText = view.findViewById<View>(R.id.wynikGryText) as TextView
        resetButton= view.findViewById<View>(R.id.resetButton) as Button

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


        showBtn = view.findViewById<View>(R.id.showListView) as Button

        val userNick = arguments?.getString("user_nick")

        showBtn.setOnClickListener {
            showBtn.text = userNick
            val intent = Intent(activity, ThirdActivity::class.java)
            intent.putExtra("user_nick", userNick)
            intent.putExtra("user_points", wynikGry.toString())
            startActivity(intent)
        }


        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragmentGra.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragmentGra().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}