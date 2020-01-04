package com.example.otroox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_match.*
import kotlinx.android.synthetic.main.summoner_fragment.view.*


class MatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)

        var nomjoueur = ""
        if (intent.hasExtra("nomJoueur")) { // vérifie qu'une valeur est associée à la clé “edittext”
            nomjoueur = intent.getStringExtra("nomjoueur") // on récupère la valeur associée à la clé
        }
        else{nomjoueur = "nop"}
niveauinvocateur.text = nomjoueur.toString()


    }

    //fun MatchActivity(view: View) {}
}