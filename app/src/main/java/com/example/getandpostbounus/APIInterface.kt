package com.example.getandpostbounus


import retrofit2.Call

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface APIInterface {
    @GET("test/")
    fun getUsers() : Call<ArrayList<PeopleItem>>

    @POST("test/")
    fun addUsers(@Body userData:PeopleItem): Call<PeopleItem>
}

