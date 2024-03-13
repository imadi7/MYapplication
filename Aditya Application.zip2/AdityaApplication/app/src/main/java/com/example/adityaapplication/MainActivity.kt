package com.example.adityaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        //intialize the UI

        val tv_signup = findViewById<TextView>(R.id.tv_signup)
        val tv_signin = findViewById<Button>(R.id.btn_sign_in)
        tv_signup.setOnClickListener {
            val intent = Intent(this, newpage::class.java)
            startActivity(intent)
        }
        tv_signin.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

    }
}