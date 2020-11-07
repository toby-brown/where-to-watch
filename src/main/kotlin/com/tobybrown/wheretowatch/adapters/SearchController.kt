package com.tobybrown.wheretowatch.adapters

import com.tobybrown.wheretowatch.application.UtellyService
import com.tobybrown.wheretowatch.model.Availability
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController(val utellyService: UtellyService) {

    @GetMapping("/availability")
    fun availability(@RequestParam title: String): String {
        return utellyService.getAvailability(title)
    }
}