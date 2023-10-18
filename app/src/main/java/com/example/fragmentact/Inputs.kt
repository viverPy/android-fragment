package com.example.fragmentact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inputs : AppCompatActivity() {

    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputs)

        backButton = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}