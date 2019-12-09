package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/{pseudo}?api_key=RGAPI-1536becf-de8b-4084-8f73-ac19ee1a810c")
        fun getInvocateur(@Path("pseudo")pseudo:String): Call<Sumoner>

}