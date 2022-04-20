package com.devine.ecommerceapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devine.ecommerceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var mainBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding!!.root)
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }

        mainBinding!!.btnOtp.setOnClickListener({
            startActivity(Intent(this, OtpActivity::class.java))
        })

    }
}


