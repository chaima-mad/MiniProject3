package com.example.miniproject3.activities.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miniproject3.activities.auth.MainActivity
import com.example.miniproject3.R
import com.example.miniproject3.activities.dashboard.ProfileActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        btn_signup.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        tv_connect.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}