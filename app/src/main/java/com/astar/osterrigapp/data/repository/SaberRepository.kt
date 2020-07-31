package com.astar.osterrigapp.data.repository

import androidx.lifecycle.LiveData
import com.astar.osterrigapp.data.model.Saber


interface SaberRepository {

    fun loadSabers(): LiveData<List<Saber>>

    fun getSaberById(id: String): LiveData<Saber>

    fun insertSaber(saber: Saber)

    fun insertSabers(saberList: List<Saber>)

    fun deleteSaber(saber: Saber)
}