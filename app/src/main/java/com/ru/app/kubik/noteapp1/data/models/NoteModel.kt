package com.ru.app.kubik.noteapp1.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_list")
data class NoteModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String,
    val desc: String,
)