package com.tobybrown.wheretowatch

import org.springframework.stereotype.Service
import retrofit2.Call

@Service
class UtellyService(
        val utellyApi: UtellyApi) {

    fun getAvailability(title: String, country: String = "uk") {
    }
}