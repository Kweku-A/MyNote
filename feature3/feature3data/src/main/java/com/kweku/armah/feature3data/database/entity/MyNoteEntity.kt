package com.kweku.armah.feature3data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_tb")
data class MyNoteEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val date: String,
    val content: String
)
