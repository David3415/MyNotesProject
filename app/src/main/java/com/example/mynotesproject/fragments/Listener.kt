package com.example.mynotesproject.fragments

import com.example.mynotesproject.entities.NoteItem

interface Listener {
    fun deleteItem(id: Int)
     fun onClickItem(note: NoteItem)
}