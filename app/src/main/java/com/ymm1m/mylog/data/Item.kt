package com.ymm1m.mylog.data

import java.sql.Timestamp
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val timestamp: Timestamp,
    val latitude: Double,
    val longitude: Double
)