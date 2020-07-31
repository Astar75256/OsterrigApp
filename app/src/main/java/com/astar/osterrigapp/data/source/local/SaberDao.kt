package com.astar.osterrigapp.data.source.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.astar.osterrigapp.data.model.Saber

@Dao
interface SaberDao {
    @Query("SELECT * FROM Saber WHERE id = :id")
    fun getLampById(id: String): LiveData<Saber>

    @Query("SELECT * FROM Saber")
    fun getLamps(): LiveData<List<Saber>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLamps(sabers: List<Saber>)

    @Delete
    fun deleteLamps(sabers: List<Saber>)
}