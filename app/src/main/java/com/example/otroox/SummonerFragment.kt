package com.example.otroox


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.summoner_fragment.*

//specifique au projet
import kotlinx.android.synthetic.main.summoner_fragment.view.*


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SummonerFragment : Fragment() {
    companion object {
        fun newInstance() = SummonerFragment()
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       // val view = inflater?.inflate(R.layout.summoner_fragment, container, false)
        //return view
        return inflater.inflate(R.layout.summoner_fragment, container, false)
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
        val retrofitService = retrofit.create(SummonerWebService::class.java)
        val summonerService = SummonerService(retrofitService)
        recherche.setOnClickListener {
            val pseudo = nominvocateur.text.toString()
                summonerService.getInvocateur(
                    pseudo,
                    { sumoner ->
                        view.niveauinvocateur.text = sumoner.summonerLevel.toString()
                        view.idCompte.text = sumoner.accountId
                        view.nomTrouver.text = sumoner.name
                    },
                    { error ->
                        view.niveauinvocateur.text = "NotFound"
                        view.nomTrouver.text = "NotFound"
                        view.idCompte.text = "NotFound"
                        }
                )


        }
    }


}



