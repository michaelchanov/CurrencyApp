package com.example.currency.data

import retrofit2.Call
import retrofit2.http.GET

interface CurrencyApi {

    @GET("v6/latest")
    fun getCurrency(): Call<Currency>
}