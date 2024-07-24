package com.example.chapter03

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.chapter03.static.doSomething

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
//        启动模式:SingleInstance
        Log.d("ThirdActivity", "Task id is $taskId")

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            ActivityCollector.finishAll()
        }
//        顶层方法实现静态方法
        doSomething()
    }
}