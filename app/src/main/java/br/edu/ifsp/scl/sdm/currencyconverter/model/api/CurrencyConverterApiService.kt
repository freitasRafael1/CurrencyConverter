package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/*
interface CurrencyConverterApiService {


    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
                "x-rapidapi-key: 92cbfcadbbmsh65c88133f386207p1389bfjsnc6224183e3af"

    )
    @GET("list")
    fun getCurrencyList(): Call<CurrencyList>

    @GET("convert")
    fun convert(
        @Query("from") from: String, //mapeando os parametros 22:40
        @Query("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>

}*/

// ... (imports)

interface CurrencyConverterApiService {

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 92cbfcadbbmsh65c88133f386207p1389bfjsnc6224183e3af"
    )
    @GET("list")
    fun getCurrencyList(): Call<CurrencyList>

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: 92cbfcadbbmsh65c88133f386207p1389bfjsnc6224183e3af"
    )
    @GET("convert")
    fun convert(
        @Query("from") from: String, //mapeando os parametros 22:40
        @Query("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>
}