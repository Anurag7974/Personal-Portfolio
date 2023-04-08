package com.example.akportfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
//    Fade Animation
    private lateinit var Image:ImageView
    private lateinit var TextView:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//      Splash Screen Code Animation
        Image = findViewById(R.id.ImageView)

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