package com.tobybrown.wheretowatch.model

data class AvailabilityResult(
        val id: String,
        val picture: String,
        val name: String,
        val locations: List<Location>)