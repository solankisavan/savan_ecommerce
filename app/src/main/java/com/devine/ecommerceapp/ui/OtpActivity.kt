package com.devine.ecommerceapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devine.ecommerceapp.R

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }
    }
}