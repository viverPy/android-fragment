package com.example.fragmentact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginButton = findViewById(R.id.loginBtn)
        loginButton.setOnClickListener {
            var dashboard: Intent = Intent(this, Dashboard::class.java)
            startActivity(dashboard)
        }
    }
}