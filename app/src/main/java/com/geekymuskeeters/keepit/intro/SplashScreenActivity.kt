package com.geekymuskeeters.keepit.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.geekymuskeeters.keepit.R

class SplashScreenActivity : AppCompatActivity() {

    lateinit var handler: Handler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SlideActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}