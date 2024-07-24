package com.example.chapter04

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class StaggeredGridActivity : AppCompatActivity() {
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staggered_grid)
        initFruits()
        val layoutManager = StaggeredGridLayoutManager(
            3,
            StaggeredGridLayoutManager.VERTICAL
        )
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(fruitList)
        recyclerView.adapter = adapter


    }

    private fun getRandomLengthString(str: String): String {
        val n = (1..20).random()
        val builder = StringBuilder()
        repeat(n) {
            builder.append(str)
        }
        return builder.toString()
    }

    private fun initFruits() {
        repeat(2) {
            fruitList.add(
                Fruit(
                    getRandomLengthString("Apple"),
                    R.drawable.ic_apple
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Banana"),
                    R.drawable.ic_banana
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Orange"),
                    R.drawable.ic_orange
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Watermelon"),
                    R.drawable.ic_watermelon
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Pear"),
                    R.drawable.ic_pear
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Grape"),
                    R.drawable.ic_grape
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Pineapple"),
                    R.drawable.ic_pineapple
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Strawberry"),
                    R.drawable.ic_strawberry
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Cherry"),
                    R.drawable.ic_cherry
                )
            )
            fruitList.add(
                Fruit(
                    getRandomLengthString("Mango"),
                    R.drawable.ic_mango
                )
            )
        }
    }
}