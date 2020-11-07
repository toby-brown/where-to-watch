package com.tobybrown.wheretowatch.adapters

import com.tobybrown.wheretowatch.model.Availability
import org.springframework.stereotype.Component
import java.lang.IllegalArgumentException

@Component
class HttpUtellyClient(val utellyApi: UtellyApi) {

    fun getAvailability(title: String, country: String = "uk"): Availability {
        val availabilityCall = utellyApi.lookupAvailability(title, country)
        val availability = availabilityCall.execute()
        if (availability.isSuccessful && availability.body() != null )
            return availability.body()!!
        else
            throw IllegalArgumentException("This title doesn't exist, sorry!")
    }
}

