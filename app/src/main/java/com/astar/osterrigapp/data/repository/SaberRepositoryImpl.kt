package com.astar.osterrigapp.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.astar.osterrigapp.data.model.Saber

class SaberRepositoryImpl : SaberRepository {
    override fun loadSabers(): LiveData<List<Saber>> {
        return MutableLiveData()
    }

    override fun getSaberById(id: String): LiveData<Saber> {
        return MutableLiveData()
    }

    override fun insertSaber(saber: Saber) {

    }

    override fun insertSabers(saberList: List<Saber>) {

    }

    override fun deleteSaber(saber: Saber) {

    }

}