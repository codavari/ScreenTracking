package com.example.screentracking.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import com.example.screentracking.models.Child

@Dao
interface ChildDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertChild(child: Child)
}