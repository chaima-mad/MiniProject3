package com.example.miniproject3.activities.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.miniproject3.activities.dashboard.ProfileActivity
import com.example.miniproject3.R
import com.example.miniproject3.activities.auth.SigninActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener{

            startActivity(Intent(this, ProfileActivity::class.java))
        }
        tv_signin.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))

        }


    }
}