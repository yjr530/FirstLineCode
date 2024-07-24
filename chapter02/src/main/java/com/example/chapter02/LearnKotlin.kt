package com.example.chapter02

import kotlin.math.min

fun main() {
    println("Hello Kotlin!")
//    val a: Int = 10
    var a: Int = 10
    a = a * 10
    println("a = " + a)

    val b = 40
    val value = largeNumber(a, b)
    println("large number is " + value)

    val num = 10L
    checkNumber(num)
//for 语句
//    val range = 0..10
    for (i in 0..10){
        println(i)
    }

    val range = 0 until 10
    for (i in 0 until 10 step 2){
        println(i)
    }
    for (i in 10 downTo 1 step 3){
        println(i)
    }

}

fun largeNumber(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}
//if 语句
//fun largeNumber(num1: Int, num2: Int): Int {
//    return if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }
//}

//fun largeNumber(num1: Int, num2: Int): Int {
////    return max(num1, num2)
//    var value = 0
//    if (num1 > num2) {
//        value = num1
//    } else {
//        value = num2
//    }
//    return value
//}

fun smallNumber(num1: Int, num2: Int): Int = min(num1, num2)
//等价于 fun smallNumber(num1: Int, num2: Int) = min(num1, num2)

//when 语句
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

//fun getScore(name: String)= when{
//    name.startsWith("Tom") ->86
//    name == "Jim" -> 77
//    name == "Jack" -> 95
//    name == "Lily" -> 100
//    else -> 0
//}

//fun getScore(name: String) = if (name == "Tom") {
//    86
//} else if (name == "Jim") {
//    77
//} else if (name == "Jack") {
//    95
//} else if (name == "Lily") {
//    100
//} else {
//    0
//}
