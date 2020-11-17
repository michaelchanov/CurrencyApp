package com.example.currency.data

import CurrencyApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.coroutines.CoroutineContext

class CorrencyRepository : CoroutineScope {
    override val coroutineContext: CoroutineContext = Dispatchers.IO

    private val currencyApi = Retrofit.Builder()
        .baseUrl("https://api.exchangerate-api.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CurrencyApi::class.java)



    fun getCurrency() = async {
        currencyApi.getCurrency()
            .execute()
            .body()
            ?.rates
    }


}