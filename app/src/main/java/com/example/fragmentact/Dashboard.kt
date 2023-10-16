package com.example.fragmentact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dashboard : AppCompatActivity() {

    private lateinit var menuButton: ImageView
    private lateinit var profileButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        menuButton = findViewById(R.id.menuBtn)
        profileButton = findViewById(R.id.profileBtn)



        val mainDashboardFragment = MainDashboardFragment()
        val profileDashboardFragment = ProfileDashboardFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, mainDashboardFragment)
            commit()
        }

        menuButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, mainDashboardFragment)
                commit()
            }
        }

        profileButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, profileDashboardFragment)
                commit()
            }
        }



    }
}