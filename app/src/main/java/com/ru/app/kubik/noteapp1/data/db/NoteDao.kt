package com.ru.app.kubik.noteapp1.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ru.app.kubik.noteapp1.data.models.NoteModel

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_list")
    fun getAll(): List<NoteModel>

    @Insert
    fun insert(note: NoteModel)
}