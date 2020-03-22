package com.tobybrown.wheretowatch.application

import com.tobybrown.wheretowatch.adapters.upstream.UtellyApi
import org.springframework.stereotype.Service

@Service
class UtellyService(val utellyApi: UtellyApi) {

    fun getAvailability(title: String, country: String = "uk") {
    }
}