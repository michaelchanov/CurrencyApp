import com.example.currency.data.Currency

import retrofit2.Call
import retrofit2.http.GET

interface CurrencyApi {
    @GET("v6/latest")
    fun getCurrency(): Call<Currency>
}