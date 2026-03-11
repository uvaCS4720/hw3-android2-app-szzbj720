package edu.nd.pmcburne.hwapp.one.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [GameEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDb : RoomDatabase() {
    abstract fun gameDao(): GameDao
}