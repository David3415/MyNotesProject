package com.example.mynotesproject.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mynotesproject.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        actionBarSettings()

    }

    private fun actionBarSettings() {
        val ab = supportActionBar
        ab?.setDisplayHomeAsUpEnabled(true)
    }
}