package com.example.chapter02

data class Cellphone(val brand: String, val price: Double)

fun main() {
    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    val brand = "Samsung"
    val price = 1299.99
    println("Cellphone(brand=" + brand + ", price=" + price + ")")
    println("Cellphone(brand=${brand},price=${price})")

//    printParams(123)
    printParams(str="world",num=123)
}

//fun printParams(num:Int,str:String="hello"){
//    println("num is $num,str is $str")
//}
fun printParams(num:Int=100,str:String){
    println("num is $num,str is $str")
}
