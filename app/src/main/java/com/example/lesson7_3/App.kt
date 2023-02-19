package com.example.lesson7_3

import android.app.Application
import androidx.room.Room
import com.example.lesson7_3.data.local.NoteDatabase
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App :Application() {

    companion object {
        lateinit var database : NoteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, NoteDatabase::class.java, "note")
            .allowMainThreadQueries()
            .build()
    }

}