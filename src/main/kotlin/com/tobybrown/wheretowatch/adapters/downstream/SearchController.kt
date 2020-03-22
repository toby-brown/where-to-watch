package com.tobybrown.wheretowatch.adapters.downstream

import com.tobybrown.wheretowatch.application.UtellyService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SearchController(val utellyService: UtellyService) {

    @PostMapping("/availability")
    fun availability(@RequestParam title: String) {

    }
}