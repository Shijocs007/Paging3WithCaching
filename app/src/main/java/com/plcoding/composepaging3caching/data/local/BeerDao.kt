package com.plcoding.composepaging3caching.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface BeerDao {

    @Upsert
    suspend fun upsertAll(beers : List<BeerEntity>)

    @Query("SELECT * from beerentity")
    fun pagingSource() : PagingSource<Int, BeerEntity>

    @Query("DELETE from beerentity")
    suspend fun clearAll()
}