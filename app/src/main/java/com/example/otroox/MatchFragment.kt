package com.example.otroox



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.match_fragment.view.*
import kotlinx.android.synthetic.main.summoner_fragment.*

//specifique au projet
import kotlinx.android.synthetic.main.summoner_fragment.view.*
import kotlinx.android.synthetic.main.summoner_fragment.view.idCompte
import kotlinx.android.synthetic.main.summoner_fragment.view.niveauinvocateur
import kotlinx.android.synthetic.main.summoner_fragment.view.nomTrouver
import org.json.JSONArray
import org.json.JSONObject


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MatchFragment : Fragment() {
    companion object {
        fun newInstance() = MatchFragment()
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       // val view = inflater?.inflate(R.layout.summoner_fragment, container, false)
        //return view
        return inflater.inflate(R.layout.match_fragment, container, false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)
        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://euw1.api.riotgames.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(MatchWebService::class.java)
        val matchService = MatchService(retrofitService)

            val idAccount = idCompte.text.toString()
                matchService.getMatch(
                    idAccount,
                    { match ->
                        view.role.text = match.championLevel.toString()
                        view.lane.text = match.championPoints.toString()

                    },
                    { error ->
                        view.role.text = "NotFound"
                        view.lane.text = "NotFound"
                        }
                )



    }


}



