package com.example.eyetrainingbase.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity(tableName = "history_table")
class History(
    @PrimaryKey var uuid: String = UUID.randomUUID().toString(),
    @ColumnInfo(name = "history_date") var date: Date,
    @ColumnInfo(name = "history_time_of_day") var timeOfDay: Int,
    @ColumnInfo(name = "history_number_of_excersises") var numOfExcersise: Int,
    @ColumnInfo(name = "history_complete") var complete: Boolean,
): Serializable
