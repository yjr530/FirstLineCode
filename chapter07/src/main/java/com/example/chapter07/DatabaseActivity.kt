package com.example.chapter07

import android.annotation.SuppressLint
import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.lang.Exception
import java.lang.NullPointerException

class DatabaseActivity : AppCompatActivity() {
    private val TAG = "DatabaseActivity"
    @SuppressLint("MissingInflatedId", "Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)
        val dbHelper = MyDatabaseHelper(this, "BookStore.db", 5)
        val createDatabase: Button = findViewById(R.id.createDatabase)
        createDatabase.setOnClickListener {
            dbHelper.writableDatabase
        }

        val addData: Button = findViewById(R.id.addData)
        addData.setOnClickListener {
            val db = dbHelper.writableDatabase
//            val values1 = ContentValues().apply {
//                put("name", "The Da Vinci Code")
//                put("author", "Dan Brown")
//                put("pages", 454)
//                put("price", 16.96)
//            }
//            db.insert("Book", null, values1)
//            val values2 = ContentValues().apply {
//                put("name", "The Lost Symbol")
//                put("author", "Dan Brown")
//                put("pages", 510)
//                put("price", 19.95)
//            }
//            db.insert("Book", null, values2)

            db.execSQL("insert into Book(name,author,pages,price) values(?,?,?,?)",
                arrayOf("The Da Vinci Code","Dan Brown","454","16.96"))
            db.execSQL("insert into Book(name,author,pages,price) values(?,?,?,?)",
                arrayOf("The Lost Symbol","Dan Brown","510","19.95"))
        }

        val updateData: Button = findViewById(R.id.updateData)
        updateData.setOnClickListener {
            val db = dbHelper.writableDatabase
//            val values = ContentValues()
//            values.put("price", 10.99)
//            db.update("Book", values, "name=?", arrayOf("The Da Vinci Code"))
            db.execSQL("update Book set price = ? where name = ?", arrayOf("10.99","The Da Vinci Code"))
        }

        val deleteData: Button = findViewById(R.id.deleteData)
        deleteData.setOnClickListener {
            val db = dbHelper.writableDatabase
//            db.delete("Book", "pages>?", arrayOf("500"))
            db.execSQL("delete from Book where pages > ?", arrayOf("500"))
        }

        val queryData:Button=findViewById(R.id.queryData)
        queryData.setOnClickListener {
            val db = dbHelper.writableDatabase
//            val cursor = db.query("Book",null,null,null,null,null,null)
            val cursor = db.rawQuery("select * from Book",null)

            if (cursor.moveToFirst()){
                do {
                    val name = cursor.getString(cursor.getColumnIndex("name"))
                    val author = cursor.getString(cursor.getColumnIndex("author"))
                    val pages = cursor.getInt(cursor.getColumnIndex("pages"))
                    val price = cursor.getDouble(cursor.getColumnIndex("price"))
                    Log.d(TAG, "book name is $name")
                    Log.d(TAG, "book author is $author")
                    Log.d(TAG, "book pages is $pages")
                    Log.d(TAG, "book price is $price")
                }while (cursor.moveToNext())
            }
            cursor.close()
        }

        val repalceData:Button=findViewById(R.id.replaceData)
        repalceData.setOnClickListener {
            val db = dbHelper.writableDatabase
            db.beginTransaction()
            try {
                db.delete("Book",null,null)
                if (true){
//                    手动抛出异常
                    throw NullPointerException()
                }
                val values = ContentValues().apply {
                    put("name","Game of Thrones")
                    put("author","George Martin")
                    put("pages",720)
                    put("price",20.85)
                }
                db.insert("Book",null,values)
                db.setTransactionSuccessful()
            }catch (e:Exception){
                e.printStackTrace()
            }finally {
                db.endTransaction()
            }
        }
    }
}