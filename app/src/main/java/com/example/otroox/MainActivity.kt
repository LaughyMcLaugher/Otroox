package com.example.otroox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.summoner_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cards = 10
        for (cardIndex in 1..cards){
            val fragment = SummonerFragment()
            supportFragmentManager.beginTransaction().add(
                flexbox.id, fragment
            ).commit()



        }

    }


    }

