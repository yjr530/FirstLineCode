package com.example.chapter04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //    private val editText :EditText = findViewById(R.id.editText)
//    val button: Button = findViewById(R.id.button)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)


//        函数式API
//        button.setOnClickListener {
//
//        }
//        实现接口的方式
        button.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                val editText: EditText = findViewById(R.id.editText)
                val inputText = editText.text.toString()
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()

                val imageView: ImageView = findViewById(R.id.imageView)
                imageView.setImageResource(R.drawable.img_2)

                val processBar: ProgressBar = findViewById(R.id.processBar)
                if (processBar.visibility == View.VISIBLE) {
                    processBar.visibility = View.GONE
                } else {
                    processBar.visibility = View.VISIBLE
                    processBar.progress = processBar.progress + 10
                }

                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }

                val intent = Intent(this,MessageActivity::class.java)
//                val intent = Intent(this,StaggeredGridActivity::class.java)
//                val intent = Intent(this,RecycleViewActivity::class.java)
//                val intent = Intent(this,ListViewActivity::class.java)
                startActivity(intent)

            }
        }
    }
}