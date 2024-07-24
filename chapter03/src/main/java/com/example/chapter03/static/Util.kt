package com.example.chapter03.static

//工具类推荐使用单例类的方法实现，使用Until.doAction()的方法调用，单例类会将整个类中的所有方法全部变成类似静态方法的调用方式
object Util {
    fun doAction() {
        println("do action")
    }
}

//使用注解以及companion object实现
class Until{
    fun doAction1() {
        println("do action1")
    }
    companion object{

        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}