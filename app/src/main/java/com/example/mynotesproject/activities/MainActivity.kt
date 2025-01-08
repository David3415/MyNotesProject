package com.example.mynotesproject.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mynotesproject.R
import com.example.mynotesproject.databinding.ActivityMainBinding
import com.example.mynotesproject.fragments.FragmentManager
import com.example.mynotesproject.fragments.NoteFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FragmentManager.setFragment(NoteFragment.newInstance(), this)
        setButtonNavListener()
    }

    private fun setButtonNavListener() {

        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)
                }


                R.id.new_item -> {
                    FragmentManager.currentFrag?.onClickNew()
                }



                R.id.settings -> {
                    startActivity(Intent(this@MainActivity,AboutActivity::class.java))
                }
                /* R.id.shop_list -> {
                     FragmentManager.setFragment(SettingsFragment.newInstance(),this)
                 }*/


            }
            true
        }
    }
}