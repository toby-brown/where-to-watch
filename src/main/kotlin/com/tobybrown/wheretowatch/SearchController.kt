package com.tobybrown.wheretowatch

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SearchController {

    @PostMapping("/availability")
    fun availability(@RequestParam title: String) {

    }
}