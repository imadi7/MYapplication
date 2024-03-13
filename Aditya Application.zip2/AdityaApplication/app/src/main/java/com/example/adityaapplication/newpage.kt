package com.example.adityaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class newpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpage)

        val tv_signin = findViewById<Button>(R.id.button)

        tv_signin.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
    }}}

