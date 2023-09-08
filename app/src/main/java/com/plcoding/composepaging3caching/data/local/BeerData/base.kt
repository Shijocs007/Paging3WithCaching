package com.plcoding.composepaging3caching.data.local.BeerData

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.composepaging3caching.data.local.BeerDao
import com.plcoding.composepaging3caching.data.local.BeerEntity

@Database(
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDataBase : RoomDatabase() {

   abstract val dao : BeerDao
}