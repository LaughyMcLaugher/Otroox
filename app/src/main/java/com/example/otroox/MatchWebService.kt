package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MatchWebService {

        //@GET("/lol/match/v4/matchlists/by-account/{idAccount}?api_key=RGAPI-887f72b8-9b56-407e-baab-4bda9e574fd3?endIndex=1")
        @GET("/lol/champion-mastery/v4/champion-masteries/by-summoner/{idAccount}/by-champion/222?api_key=RGAPI-887f72b8-9b56-407e-baab-4bda9e574fd3")

        fun getMatch(@Path("idAccount")idAccount:String): Call<Match>




}


