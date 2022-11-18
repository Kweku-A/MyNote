package com.kweku.armah.mynote.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kweku.armah.mynote.data.database.dao.MyNoteEntityDao
import com.kweku.armah.mynote.data.database.entity.MyNoteEntity

@Database(entities = [MyNoteEntity::class], version = 1, exportSchema = false)
abstract class MyNoteDatabase : RoomDatabase() {
    abstract fun myNoteEntityDao(): MyNoteEntityDao
}