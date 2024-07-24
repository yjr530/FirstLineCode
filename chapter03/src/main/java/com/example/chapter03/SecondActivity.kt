package com.example.chapter03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        Log.d("SecondActivity", "Task id is $taskId")
//        Log.d("SecondActivity", this.toString())
//        接收上一个Activity传递的数据
//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity", "extra data is $extraData")
        val button2:Button = findViewById(R.id.button2)
        button2.setOnClickListener{
//            接收上一个Activity传递的数据
//            val intent = Intent()
//            intent.putExtra("data_return","Hello FirstActivity")
//            setResult(RESULT_OK,intent)
//            finish()

//            启动模式:SingleTop
//            val intent = Intent(this,FirstActivity::class.java)
//            startActivity(intent)

//            启动模式:SingleInstance
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent()
        intent.putExtra("data_return","Hello FirstActivity")
        setResult(RESULT_OK,intent)
        finish()
    }

//    启动模式:SingleTask
    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy: ")
    }
}