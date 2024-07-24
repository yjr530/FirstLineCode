package com.example.chapter02

fun main() {
//    List集合
//    val list = ArrayList<String>()
//    list.add("Apple")
//    list.add("Apple")
//    list.add("Apple")
//    list.add("Apple")
//    list.add("Apple")
//    println(list)

//    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    println(list)
//    for (fruit in list){
//        println(fruit)
//    }
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    list.add("Watermelon")
    for (fruit in list) {
        println(fruit)
    }
//    Set集合
    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (fruit in set) {
        println(fruit)
    }
//    Map集合
//    val map = HashMap<String,Int>()
//    map.put("Apple",1)
//    map.put("Banana",2)
//    map.put("Orange",3)
//    map.put("Pear",4)
//    map.put("Grape",5)
//    println(map)

//    val map = HashMap<String,Int>()
//    map["Apple"]=1
//    map["Banana"]=2
//    map["Orange"]=3
//    map["Pear"]=4
//    map["Grape"]=5
//    println(map)

    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    for ((fruit, number) in map) {
        println("fruit is " + fruit + ", number is " + number)
    }

//    函数式API的语法结构
    val list2 = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    var maxLengthFruit = ""
//    for (fruit in list) {
//        if (fruit.length > maxLengthFruit.length) {
//            maxLengthFruit = fruit
//        }
//    }
//    val maxLengthFruit = list2.maxBy { it.length }
//    val lambda = {fruit:String -> fruit.length}
//    val maxLengthFruit = list2.maxBy(lambda)
//    val maxLengthFruit = list.maxBy({ fruit: String -> fruit.length })
//    val maxLengthFruit = list.maxBy(){ fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy{ fruit: String -> fruit.length }
//    val maxLengthFruit = list.maxBy{ fruit -> fruit.length }
    val maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is " + maxLengthFruit)

//    函数式API:集合中的map函数
    val newList = list.map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }

//    函数式API:filter函数
    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)



}
