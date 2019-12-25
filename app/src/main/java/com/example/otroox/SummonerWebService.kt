package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/{pseudo}?api_key=RGAPI-5d640626-45ce-41eb-b7fd-661b20e3f495")
        fun getInvocateur(@Path("pseudo")pseudo:String): Call<Sumoner>

}