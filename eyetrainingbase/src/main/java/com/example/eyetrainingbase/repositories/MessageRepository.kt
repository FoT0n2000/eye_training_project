package com.example.eyetrainingbase.repositories

import com.example.eyetrainingbase.DBProvider
import com.example.eyetrainingbase.models.History
import java.util.*

class HistoryRepository {

    private val messageDao = DBProvider.instance.HistoryDao()

    companion object {
        val instance = HistoryRepository()
    }

    fun getAllWeekHistory(date: Date) = messageDao.getAllWeekHistory(date)

    suspend fun addHistory(model: History) = messageDao.addHistory(model)

    suspend fun deleteHistory(model: History) = messageDao.deleteHistory(model)

    suspend fun updateHistory(model: History) = messageDao.updateHistory(model)
}