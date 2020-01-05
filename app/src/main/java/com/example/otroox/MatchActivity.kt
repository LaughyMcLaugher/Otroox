package com.example.otroox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_match.*
import kotlinx.android.synthetic.main.match_fragment.*



class MatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.match_fragment)

        var idjoueur = ""
        var niveaujoueur = ""
        var nomjoueur = ""
        if (intent.hasExtra("nomJoueur")) { // vérifie qu'une valeur est associée à la clé “edittext”
            nomjoueur = intent.getStringExtra("nomJoueur") // on récupère la valeur associée à la clé
        }
        else{nomjoueur = "nop"}

        if (intent.hasExtra("niveauJoueur")) { // vérifie qu'une valeur est associée à la clé “edittext”
            niveaujoueur = intent.getStringExtra("niveauJoueur") // on récupère la valeur associée à la clé
        }
        else{niveaujoueur = "nop"}

        if (intent.hasExtra("idJoueur")) { // vérifie qu'une valeur est associée à la clé “edittext”
            idjoueur = intent.getStringExtra("idJoueur") // on récupère la valeur associée à la clé
        }
        else{idjoueur = "nop"}

nomTrouver.text = nomjoueur
niveauinvocateur.text = niveaujoueur
        idCompte.text = idjoueur

/*
        val cards = 10
        for (cardIndex in 1..cards){
            val fragment = MatchFragment()
            supportFragmentManager.beginTransaction().add(
                flexboxmatch.id, fragment
            ).commit()
        }
*/
    }

}