package com.example.chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleViewActivity : AppCompatActivity() {
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        initFruits()
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(fruitList)
        recyclerView.adapter = adapter
    }

    private fun initFruits() {
        repeat(2) {
            fruitList.add(Fruit("Apple", R.drawable.ic_apple))
            fruitList.add(Fruit("Banana", R.drawable.ic_banana))
            fruitList.add(Fruit("Orange", R.drawable.ic_orange))
            fruitList.add(Fruit("Watermelon", R.drawable.ic_watermelon))
            fruitList.add(Fruit("Pear", R.drawable.ic_pear))
            fruitList.add(Fruit("Grape", R.drawable.ic_grape))
            fruitList.add(Fruit("Pineapple", R.drawable.ic_pineapple))
            fruitList.add(Fruit("Strawberry", R.drawable.ic_strawberry))
            fruitList.add(Fruit("Cherry", R.drawable.ic_cherry))
            fruitList.add(Fruit("Mango", R.drawable.ic_mango))
        }
    }
}