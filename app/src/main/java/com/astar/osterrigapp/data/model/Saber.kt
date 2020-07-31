package com.astar.osterrigapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Saber(
    @PrimaryKey val id: String,
    val name: String,
    val macAddress: String,
    val model: String? = "",
    val description: String? = "",
    val typeSaber: Int = 0,
    val countLeds: Int? = 0
)