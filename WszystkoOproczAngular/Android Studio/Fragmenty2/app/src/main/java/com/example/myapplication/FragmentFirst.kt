package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btnSend)

        //Odbieranie danych z MainActivity
        val messageFromMainActivity = arguments?.getString("message_activity")
        button.text = messageFromMainActivity


        //Wysyłanie danych do MainActivity
        button.setOnClickListener {
            val result = Bundle().apply {
                putString("message", "dane z FragmentFirst")
            }

            parentFragmentManager.setFragmentResult("KeyFragment", result)

        }


    }
}