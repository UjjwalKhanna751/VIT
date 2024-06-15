package com.example.vit.kotlinexs

fun main(){
    var myStudent: Student=Student(name = "Ujjwal", age = 21, postalAddress = "kolkata")
    println(myStudent.name)
    myStudent.name="Khanna"
    println(myStudent.name)
}