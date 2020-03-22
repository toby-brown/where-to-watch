package com.tobybrown.wheretowatch.application

import com.tobybrown.wheretowatch.adapters.upstream.UtellyApi
import com.tobybrown.wheretowatch.model.Availability
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class UtellyService(val utellyApi: UtellyApi) {

    fun getAvailability(title: String, country: String = "uk"): Availability? {
        val availabilityCall = utellyApi.lookupAvailability(title, country)
        val availability = availabilityCall.execute()
        if (availability.isSuccessful)
            return availability.body()
        else
            throw IllegalArgumentException("This title doesn't exist, sorry!")
    }
}