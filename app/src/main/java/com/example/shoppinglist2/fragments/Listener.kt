package com.example.shoppinglist2.fragments

import com.example.shoppinglist2.entities.NoteItem

interface Listener {
    fun deleteItem(id: Int)
     fun onClickItem(note: NoteItem)
}