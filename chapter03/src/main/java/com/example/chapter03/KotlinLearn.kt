package com.example.chapter03


fun main(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    val builder = StringBuilder()
//    builder.append("Start eating fruits.\n")
//    for (fruit in list){
//        builder.append(fruit).append("\n")
//    }
//    builder.append("Ate all fruits.")
//    val result = builder.toString()
//    println(result)

//    with函数
//    val result = with(StringBuilder()){
//        append("Start eating fruits.\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    println(result)

//    run函数
//    val result = StringBuilder().run {
//        append("Start eating fruits.\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("Ate all fruits.")
//        toString()
//    }
//    println(result)

//    apply函数
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())

}