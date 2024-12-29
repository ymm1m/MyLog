package com.ymm1m.mylog.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class MylogDatabase: RoomDatabase() {
    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance: MylogDatabase? = null
        fun getDatabase(context: Context): MylogDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, MylogDatabase::class.java, "mylog_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}