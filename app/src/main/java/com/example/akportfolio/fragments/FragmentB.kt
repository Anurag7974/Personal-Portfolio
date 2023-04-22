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

class FragmentB : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val SkipB : TextView = view.findViewById(R.id.skipB)
        SkipB.setOnClickListener {
            val intent = Intent(context, Deshboard::class.java)
            startActivity(intent)
        }
        return view
    }


}