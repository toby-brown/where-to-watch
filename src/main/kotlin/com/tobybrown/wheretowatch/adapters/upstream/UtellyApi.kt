package com.tobybrown.wheretowatch.adapters.upstream

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UtellyApi {

    @Headers(
            "X-RapidAPI-Host: utelly-tv-shows-and-movies-availability-v1.p.rapidapi.com",
            "X-RapidAPI-Key: 3dbc785431msh3575375ff91bcc8p19d602jsnb40b71e41752")
    @GET("/lookup")
    fun lookupAvailability(
            @Query("term") term: String,
            @Query("country") country: String)
}