package com.example.screentracking.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.screentracking.models.Child

@Database(entities = [Child::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): ChildDao

}