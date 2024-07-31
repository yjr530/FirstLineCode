package com.example.chapter05

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.chapter05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button: Button = findViewById(R.id.button)
//        button.setOnClickListener {
//            replaceFragment(AnotherRightFragment())
//        }
//        replaceFragment(RightFragment())
    }

//    private fun replaceFragment(fragment: Fragment) {
//        val fragManager = supportFragmentManager
//        val transaction = fragManager.beginTransaction()
//        transaction.replace(R.id.rightLayout, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }
}