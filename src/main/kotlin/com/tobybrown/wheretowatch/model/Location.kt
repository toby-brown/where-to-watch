package com.tobybrown.wheretowatch.model

/**
 * Information about a location that the film/show is available at.
 * e.g. Netflix, BBC iplayer
 */
data class Location(
        val icon: String,
        val display_name: String,
        val name: String,
        val id: String,
        val url: String
)