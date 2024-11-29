package com.example.mynotesproject.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.mynotesproject.entities.NoteItem

@Database(
    entities = [ NoteItem::class],
    version = 1
)
abstract class MainDatabase : RoomDatabase() {
    abstract fun getDao():Dao
    companion object {
        @Volatile
        private var INSTANCE: MainDatabase? = null
        fun getDataBase(context: Context): MainDatabase {
            //// Если БД создана, то возвращаем БД - return INSTANCE
            // Если БД ещё не создана, блокируем все потоки (synchronized)
            return INSTANCE ?: synchronized(this) {
                //// Создаем временную перем для хранения Новой БД - instance
                //// Создаём БД с помощью Room.databaseBuilder
                val instance = Room.databaseBuilder(//// Параметры функции:
                    context.applicationContext,     ///контекст всего приложения
                    MainDatabase::class.java,       ///Имя текущего класса
                    "my_notes.db"          ////имя БД
                ).build()
                instance//// возвращаем созданную  instance
            }
        }
    }
}