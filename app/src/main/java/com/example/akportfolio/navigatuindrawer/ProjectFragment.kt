package com.example.akportfolio.navigatuindrawer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.akportfolio.ProjectDetails
import com.example.akportfolio.R


class ProjectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_project, container, false)
        val swipeNext : CardView = view.findViewById(R.id.cardView_01)
        swipeNext.setOnClickListener {
            val intent = Intent(context, ProjectDetails::class.java)
            startActivity(intent)
        }
        return view
    }

}