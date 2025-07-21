package com.ru.app.kubik.noteapp1

import android.app.Application
import androidx.room.Room
import com.ru.app.kubik.noteapp1.data.db.AppDatabase

class App : Application() {
    companion object {
        var appDatabase: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
//        appDatabase = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "data_base")
//            .allowMainThreadQueries().build();
        getInstance();
    }

    private fun getInstance(): AppDatabase? {
        if (appDatabase == null) {
            appDatabase = applicationContext?.let { context ->
                Room.databaseBuilder(context, AppDatabase::class.java, "note_database")
                    .fallbackToDestructiveMigration(false).allowMainThreadQueries().build()

            }
        }
        return  appDatabase;
    }


}