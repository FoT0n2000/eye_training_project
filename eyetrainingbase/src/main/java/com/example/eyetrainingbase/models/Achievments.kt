package com.example.eyetrainingbase.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity(tableName = "achievments_table")
class Achievments(
    @PrimaryKey var uuid: String = UUID.randomUUID().toString(),
    @ColumnInfo(name = "achievments_name") var name: String,
    @ColumnInfo(name = "achievments_desc") var desc: String,
    @ColumnInfo(name = "achievments_image", typeAffinity = ColumnInfo.BLOB) var image: ByteArray?,
    @ColumnInfo(name = "achievments_complete") var complete: Boolean,
):Serializable
