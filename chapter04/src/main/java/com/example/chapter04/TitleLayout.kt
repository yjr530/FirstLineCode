package com.example.chapter04

import android.app.Activity
import android.content.AttributionSource
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class TitleLayout(context:Context,attrs:AttributeSet):LinearLayout(context,attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this)
        val titleBack: TextView = findViewById(R.id.titleBack)
        titleBack.setOnClickListener{
            val activity = context as Activity
            activity.finish()
        }
        val titleEdit:Button = findViewById(R.id.titleEdit)
        titleEdit.setOnClickListener {
            Toast.makeText(context,"You clicked edit button",Toast.LENGTH_SHORT).show()
        }


    }
}