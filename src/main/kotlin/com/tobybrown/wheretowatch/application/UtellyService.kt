package com.tobybrown.wheretowatch.application

import com.tobybrown.wheretowatch.adapters.HttpUtellyClient
import com.tobybrown.wheretowatch.adapters.UtellyApi
import com.tobybrown.wheretowatch.model.Availability
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class UtellyService(val utellyClient: HttpUtellyClient) {

    fun getAvailability(title: String, country: String = "uk"): String {
        val availability = utellyClient.getAvailability(title, country)
        return availability.results.first().locations.map { it.display_name }.joinToString()
    }
}