package com.example.chapter03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FirstActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button1: Button = findViewById(R.id.button1)
        Log.d("FirstActivity", "Task id is $taskId")
        button1.setOnClickListener {
//            Toast.makeText(this, "You clicked Button 1", Toast.LENGTH_SHORT).show()
//            finish()

//            显示intent
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)

//            隐式intent
//            val intent = Intent("com.example.chapter03.ACTION_START")
//            intent.addCategory("com.example.chapter03.MY_CATEGORY")
//            startActivity(intent)

//            浏览器
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)

//            打电话
//            val intent=Intent(Intent.ACTION_DIAL)
//            intent.data=Uri.parse("tel:10086")
//            startActivity(intent)

//            向下一个Activity传递数据
//            val data = "Hello SecondActivity"
//            val intent = Intent(this,SecondActivity::class.java)
//            intent.putExtra("extra_data",data)
//            startActivity(intent)

//            返回数据给上一个Activity
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivityForResult(intent, 1)

//            Log.d("FirstActivity", this.toString())
//            启动模式:Standard
//            val intent = Intent(this,FirstActivity::class.java)
//            startActivity(intent)

//            启动模式:SingleTop
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)

//            启动模式:SingleInstance
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstActivity", "returned data is $returnedData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(
                this, "You clicked Add",
                Toast.LENGTH_SHORT
            ).show()

            R.id.remove_item -> Toast.makeText(
                this, "You clicked Remove",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true
    }

//    启动模式:SingleTask
    override fun onRestart() {
        super.onRestart()
        Log.d("FirstActivity", "onRestart: ")
    }
}