package com.example.otroox


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso

//specifique au projet
import com.example.otroox.R
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
        val view = inflater?.inflate(R.layout.summoner_fragment, container, false)
        return view
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

        summonerService.getRandomCocktail(
            { sumoner ->
                view.niveauinvocateur.text = sumoner.summonerLevel.toString()
                view.nominvocateur.text = sumoner.name
            }, { error -> TODO() }
        )
    }

}



