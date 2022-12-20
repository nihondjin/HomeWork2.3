package com.timmland.android23.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")

data class NoteModel(
    @PrimaryKey
    val image: Int,
    @ColumnInfo(name = "dateAdded")
    val title: String,
    @ColumnInfo(name = "noteText")
    val description: String
)