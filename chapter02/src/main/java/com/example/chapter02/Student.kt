package com.example.chapter02

//class Student : Person() {
//    var sno = ""
//    var grade = 0
//}

//class Student(val sno: String, val grade: Int,name:String,age:Int) :
//    Person(name,age) {
//    init {
//        println("sno is " + sno)
//        println("grade is " + grade)
//    }
//}

//class Student(val sno: String, val grade: Int, name: String, age: Int) :
//    Person(name, age) {
//    constructor(name: String, age: Int) : this("", 0, name, age) {
//    }
//    constructor():this("",0){
//    }
//}

//class Student(val sno:String="",val grade:Int=0,name:String="",age:Int=0):
//        Person(name, age){}

class Student(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println(name + " is reading.")
    }

//    override fun doHomework() {
//        println(name+" is doing homework.")
//    }

}

fun main() {
//    val student1 = Student("a123", 5, "Jack", 19)
//    val student2 = Student("a123", 5)
//    println(student1.sno + " " + student1.grade)
    val student = Student("Jack", 19)
//    student.doHomework()
//    student.readBooks()
    doStudy(student)
    doStudy(null)
}

//fun doStudy(study: Study){
//    study.readBooks()
//    study.doHomework()
//}
//fun doStudy(study: Study?) {
//    if (study != null) {
//        study.readBooks()
//        study.doHomework()
//    }
//}
//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}
fun doStudy(study: Study?){
    study?.let{
        it.readBooks()
        it.doHomework()
    }

}


//fun getTextLength(Text:String?):Int{
//    if (Text!=null){
//        return Text.length
//    }
//    return 0
//}

fun getTextLength(text:String?)=text?.length?:0