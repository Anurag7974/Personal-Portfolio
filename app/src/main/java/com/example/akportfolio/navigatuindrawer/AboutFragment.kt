package com.example.akportfolio.navigatuindrawer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.akportfolio.R


class AboutFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about, container, false)
        val nextFrg : TextView = view.findViewById(R.id.contact_me)
        nextFrg.setOnClickListener {
            val fragment = ContactFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.container, fragment)?.commit()
        }
        return view
    }

}