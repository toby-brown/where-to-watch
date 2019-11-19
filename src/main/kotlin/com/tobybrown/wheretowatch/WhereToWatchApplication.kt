package com.tobybrown.wheretowatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class WhereToWatchApplication {

    fun main(args: Array<String>) {
        runApplication<WhereToWatchApplication>(*args)
    }
}