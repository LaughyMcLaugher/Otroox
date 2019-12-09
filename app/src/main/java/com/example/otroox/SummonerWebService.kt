package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/Aatrlx?api_key=RGAPI-1536becf-de8b-4084-8f73-ac19ee1a810c")
        fun getInvocateur(): Call<Sumoner>

}

