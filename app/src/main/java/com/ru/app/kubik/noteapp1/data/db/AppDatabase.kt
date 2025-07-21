package com.ru.app.kubik.noteapp1.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ru.app.kubik.noteapp1.data.models.NoteModel

@Database(entities = [NoteModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao():NoteDao

}