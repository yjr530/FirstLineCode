package com.example.chapter10

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService:IntentService("MyIntentService") {
    private val TAG = "MyIntentService"

    override fun onHandleIntent(p0: Intent?) {
        Log.d(TAG, "Thread id is ${Thread.currentThread().name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}