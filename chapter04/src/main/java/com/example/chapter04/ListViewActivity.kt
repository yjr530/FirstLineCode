package com.example.chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    private val data = listOf(
        "Apple", "Banana", "Orange", "Watermelon",
        "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
        "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
        "Pineapple", "Strawberry", "Cherry", "Mango"
    )

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
//        val adapter = ArrayAdapter<String>(
//            this, android.R
//                .layout.simple_list_item_1, data
//        )
        initFruits()
        val adapter = FruitAdapter(this,R.layout.fruit_item,fruitList)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

//        listView.setOnItemClickListener { parent, view, position, id ->
//            val fruit = fruitList[position]
//            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
//        }
        listView.setOnItemClickListener { _, _, position, _ ->
            val fruit = fruitList[position]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFruits() {
        repeat(2){
            fruitList.add(Fruit("Apple",R.drawable.ic_apple))
            fruitList.add(Fruit("Banana",R.drawable.ic_banana))
            fruitList.add(Fruit("Orange",R.drawable.ic_orange))
            fruitList.add(Fruit("Watermelon",R.drawable.ic_watermelon))
            fruitList.add(Fruit("Pear",R.drawable.ic_pear))
            fruitList.add(Fruit("Grape",R.drawable.ic_grape))
            fruitList.add(Fruit("Pineapple",R.drawable.ic_pineapple))
            fruitList.add(Fruit("Strawberry",R.drawable.ic_strawberry))
            fruitList.add(Fruit("Cherry",R.drawable.ic_cherry))
            fruitList.add(Fruit("Mango",R.drawable.ic_mango))
        }
    }
}