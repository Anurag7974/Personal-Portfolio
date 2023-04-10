package com.example.akportfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
//import com.example.akportfolio.liquidswipe.PageFragment

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
//    Fade Animation
    private lateinit var Image:ImageView
    private lateinit var TextView:TextView
    private lateinit var Image1:ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//      Splash Screen Code Animation
        Image = findViewById(R.id.ImageView)
        Image1 = findViewById(R.id.img)
        TextView = findViewById(R.id.textView2)
        Image.alpha = 0f


        Image.animate().setDuration(2000).alpha(1f).withEndAction {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)


            finish()
        }

    }

}