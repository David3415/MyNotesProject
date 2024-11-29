package com.example.mynotesproject.activities

import android.app.Application

import com.example.mynotesproject.db.MainDatabase

class MainApp:Application() {
    val database by lazy { MainDatabase.getDataBase(this) }
}