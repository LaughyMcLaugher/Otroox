package com.example.otroox

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class SummonerService constructor(
    private val webservice: SummonerWebService
){
        fun getInvocateur(pseudo:String, onDone: (Sumoner)->Unit, onError: (Throwable)->Unit ) {
            webservice.getInvocateur(pseudo).enqueue(object : Callback<Sumoner> {
                override fun onResponse(
                    call: Call<Sumoner>,
                    response: Response<Sumoner>
                ) {
                    try {
                        val sumoner = response.body()!!

                    onDone(sumoner)
                    }catch (e : Exception){
                        onError(e)
                    }
                }
                override fun onFailure(call: Call<Sumoner>, t: Throwable) {
                    onError(t)

            }
        })
    }
}