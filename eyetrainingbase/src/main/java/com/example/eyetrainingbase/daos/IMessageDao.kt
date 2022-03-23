package com.example.eyetrainingbase.daos

import androidx.room.*
import com.example.models.History
import java.util.*

@Dao
interface IHistoryDao {

    @Query("SELECT * FROM history_table WHERE history_date <= :history_date ORDER BY history_date DESC LIMIT 7")
    fun getAllWeekHistory(history_date: Date): List<History>

    @Insert
    suspend fun addHistory(model: History)

    @Delete
    suspend fun deleteHistory(model: History)

    @Update
    suspend fun updateHistory(model: History)
}