package com.example.otroox

import retrofit2.Call
import retrofit2.http.GET

interface SummonerWebService {

        @GET("/lol/summoner/v4/summoners/by-name/Aatrlx?api_key=RGAPI-21698a6d-0aa1-4fed-b7ae-0322a7a12290")
        fun getRandomCocktail(): Call<Sumoner>

}

