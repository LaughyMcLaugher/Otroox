package com.example.otroox

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class MatchService constructor(
    private val webservice: MatchWebService
){
        fun getMatch(idAccount:String, onDone: (Match)->Unit, onError: (Throwable)->Unit ) {
            webservice.getMatch(idAccount).enqueue(object : Callback<Match> {
                override fun onResponse(
                    call: Call<Match>,
                    response: Response<Match>
                ) {
                    try {
                        val match = response.body()!!

                    onDone(match)
                    }catch (e : Exception){
                        onError(e)
                    }
                }
                override fun onFailure(call: Call<Match>, t: Throwable) {
                    onError(t)

            }
        })
    }

   /* fun pageMatch(View view){
        startActivity(Intent(this,MatchActivity)) */
    }
