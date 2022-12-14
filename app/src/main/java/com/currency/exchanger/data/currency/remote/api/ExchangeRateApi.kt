package com.currency.exchanger.data.currency.remote.api

import com.currency.exchanger.data.currency.remote.dto.RateResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ExchangeRateApi {
    @GET("convert/")
    suspend fun convert(@Query("amount") from: Double,
                        @Query("from") to: String,
                        @Query("to") claim: String,
                       ) : Response<RateResponse>
}