package com.example.chapter08

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.contentValuesOf
import com.example.chapter08.databinding.ActivityProviderBinding

class ProviderActivity : AppCompatActivity() {
    private var bookId: String? = null
    private val TAG = "ProviderActivity"
    private lateinit var binding: ActivityProviderBinding

    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provider)
        binding = ActivityProviderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addData.setOnClickListener {
            val uri = Uri.parse("content://com.example.chapter07.provider/book")
            val values = contentValuesOf(
                "name" to "A Clash of Kings",
                "author" to "George Martin",
                "pages" to 1040,
                "price" to 22.85
            )
            val newUri = contentResolver.insert(uri, values)
            bookId = newUri?.pathSegments?.get(1)
        }

        binding.queryData.setOnClickListener {
            val uri = Uri.parse("content://com.example.chapter07.provider/book")
            contentResolver.query(uri, null, null, null, null)?.apply {
                while (moveToNext()) {
                    val name = getString(getColumnIndex("name"))
                    val author = getString(getColumnIndex("author"))
                    val pages = getInt(getColumnIndex("pages"))
                    val price = getDouble(getColumnIndex("price"))
                    Log.d(TAG, "book name is $name")
                    Log.d(TAG, "book author is $author")
                    Log.d(TAG, "book pages is $pages")
                    Log.d(TAG, "book price is $price")
                }
                close()
            }
        }

        binding.updateData.setOnClickListener {
            bookId?.let {
                val uri = Uri.parse("content://com.example.chapter07.provider/book/${it}")
//                val values = ContentValues().apply {
//                    put("name","A Storm of Swords")
//                    put("author","George Martin")
//                    put("pages",1216)
//                    put("price",24.95)
//                }
                val values = contentValuesOf(
                    "name" to "A Storm of Swords",
                    "pages" to 1216,
                    "price" to 24.05
                )
                contentResolver.update(uri, values, null, null)
            }
        }

        binding.deleteData.setOnClickListener {
            bookId?.let {
                val uri = Uri.parse("content://com.example.chapter07.provider/book/${it}")
                contentResolver.delete(uri, null, null)
            }
        }
    }
}