package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/{pseudo}?api_key=RGAPI-887f72b8-9b56-407e-baab-4bda9e574fd3")
        fun getInvocateur(@Path("pseudo")pseudo:String): Call<Sumoner>
        //fun pageMatch()

}