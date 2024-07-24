package com.example.chapter07

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SharedPreferencesActivity : AppCompatActivity() {
    private val TAG = "SharedPreferenceActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        val saveButton:Button = findViewById(R.id.saveButton)
        saveButton.setOnClickListener {
            val editor = getSharedPreferences("data", Context.MODE_PRIVATE).edit()
            editor.putString("name","Tom")
            editor.putInt("age",28)
            editor.putBoolean("married",false)
            editor.apply()
        }
        val restoreButton:Button = findViewById(R.id.restoreButton)
        restoreButton.setOnClickListener {
            val prefs = getSharedPreferences("data",Context.MODE_PRIVATE)
            val name=prefs.getString("name","")
            val age=prefs.getInt("age",0)
            val married = prefs.getBoolean("married",false)
            Log.d(TAG, "name is ${name} ")
            Log.d(TAG, "age is $age")
            Log.d(TAG, "married is $married")
        }
    }
}