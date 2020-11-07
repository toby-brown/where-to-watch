package com.tobybrown.wheretowatch

import com.tobybrown.wheretowatch.adapters.UtellyApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@SpringBootApplication
open class WhereToWatchApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<WhereToWatchApplication>(*args)
        }
    }

    @Bean
    open fun utellyApi(): UtellyApi {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://utelly-tv-shows-and-movies-availability-v1.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit.create(UtellyApi::class.java)
    }
}