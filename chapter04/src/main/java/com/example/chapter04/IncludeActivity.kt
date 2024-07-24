package com.example.chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IncludeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_include)
        supportActionBar?.hide()
    }
}