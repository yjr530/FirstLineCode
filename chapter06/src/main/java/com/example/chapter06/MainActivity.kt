package com.example.chapter06

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : BaseActivity() {
    lateinit var timeChangeRecceiver: TimeChangeReceiver

    inner class TimeChangeReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            Toast.makeText(context, "Time has changed", Toast.LENGTH_SHORT).show()
        }

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.TIME_TICK")
        timeChangeRecceiver = TimeChangeReceiver()
        registerReceiver(timeChangeRecceiver, intentFilter)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent("com.example.chapter06.MY_BROADCAST")
            intent.setPackage(packageName)
//            标准广播
//            sendBroadcast(intent)

//            有序广播
            sendOrderedBroadcast(intent, null)

        }

        val forceOffline: Button = findViewById(R.id.forceOffline)
        forceOffline.setOnClickListener {
            val intent = Intent("com.example.chapter06.FORCE_OFFLINE")
            sendBroadcast(intent)
        }
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)


    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangeRecceiver)
    }
}