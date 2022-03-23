package com.example.eyetrainingbase

import android.content.Context
import android.database.CursorWindow
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.eyetrainingbase.daos.IHistoryDao
import com.example.eyetrainingbase.models.History
import java.lang.Exception
import java.lang.reflect.Field

@Database(entities = [History::class, ], version = 2)
abstract class DBProvider: RoomDatabase() {

    companion object {
        lateinit var instance: DBProvider

        fun create(context: Context) {
            instance = Room.databaseBuilder(context, DBProvider::class.java, "database2").build()
            try {
                val field: Field = CursorWindow::class.java.getDeclaredField("sCursorWindowSize")
                field.setAccessible(true)
                field.set(null, 100 * 1024 * 1024) //the 100MB is the new size
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    abstract fun HistoryDao(): IHistoryDao
}