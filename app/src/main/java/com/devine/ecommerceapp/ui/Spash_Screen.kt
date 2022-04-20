package com.devine.ecommerceapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.devine.ecommerceapp.R

class Spash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
        Handler().apply {
            val runnable = object : Runnable {
                override fun run() {

                   // postDelayed(this, 2000)

                    startActivity(Intent(applicationContext,MainActivity::class.java))
                }
            }
            postDelayed(runnable, 5000)
        }
    }
}