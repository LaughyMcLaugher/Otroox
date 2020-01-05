package com.example.otroox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.summoner_fragment.*
import kotlinx.android.synthetic.main.summoner_fragment.view.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    //var niveaujoueur = ""
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

    fun pageMatch(view: View) {

        val idjoueur = idCompte.text
        val niveaujoueur = niveauinvocateur.text
        val nomjoueur = nomTrouver.text
        val pintent = Intent(this,MatchActivity::class.java)
        pintent.putExtra("nomJoueur",nomjoueur)
        pintent.putExtra("niveauJoueur",niveaujoueur)
        pintent.putExtra("idJoueur",idjoueur)
        startActivity(pintent)
    }
    }

