package com.example.fragmentact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MidtermExam : AppCompatActivity() {

    lateinit var soundButton: ImageButton
    var isMuted: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_midterm_exam)

        soundButton = findViewById(R.id.soundBtn)
        soundButton.setImageResource(R.drawable.iconunmute)

        soundButton.setOnClickListener {
            if (isMuted){
                soundButton.setImageResource(R.drawable.iconunmute)
            }else{
                soundButton.setImageResource(R.drawable.iconmute)
            }
            isMuted = !isMuted
        }
    }

}