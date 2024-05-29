package com.example.shoppinglist2.activities

import android.app.Application

import com.example.shoppinglist2.db.MainDatabase

class MainApp:Application() {
    val database by lazy { MainDatabase.getDataBase(this) }
}