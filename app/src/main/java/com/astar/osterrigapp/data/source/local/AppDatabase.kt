package com.astar.osterrigapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.astar.osterrigapp.data.model.Saber
import com.astar.osterrigapp.util.Database.VERSION


@Database(entities = [Saber::class], version = VERSION, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun saberDao(): SaberDao

}