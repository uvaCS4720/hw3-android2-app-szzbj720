package edu.nd.pmcburne.hwapp.one.data.db

import android.content.Context
import androidx.room.Room

object DbModule {
    fun create(context: Context): AppDb =
        Room.databaseBuilder(context, AppDb::class.java, "scores.db")
            .fallbackToDestructiveMigration()
            .build()
}