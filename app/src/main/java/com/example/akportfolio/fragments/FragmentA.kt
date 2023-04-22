package com.example.akportfolio.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.akportfolio.Deshboard
import com.example.akportfolio.R


class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_a, container, false)
        val skipA : TextView = view.findViewById(R.id.skipTextView)
        skipA.setOnClickListener {
            val intent = Intent(context, Deshboard::class.java)
            startActivity(intent)
        }

        return view
    }

}