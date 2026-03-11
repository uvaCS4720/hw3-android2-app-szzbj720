package edu.nd.pmcburne.hwapp.one.data.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object NetworkModule {
    private val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .build()

    val api: NcaaApi = Retrofit.Builder()
        .baseUrl("https://ncaa-api.henrygd.me/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NcaaApi::class.java)
}