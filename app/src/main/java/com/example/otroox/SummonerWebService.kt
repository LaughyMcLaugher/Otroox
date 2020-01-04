package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/{pseudo}?api_key=RGAPI-5952f3a8-d3e0-4eae-a20c-eb7b0a7a5bc4")
        fun getInvocateur(@Path("pseudo")pseudo:String): Call<Sumoner>
        //fun pageMatch()

}