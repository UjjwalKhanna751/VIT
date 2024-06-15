package com.example.vit.kotlinexs

fun main(){
    var myTeacher: Teacher= Teacher(name = "Abdul", age = 121, postalAddress = "abc")
    var myStudent: Student=Student(name = "Ujjwal", age = 21, postalAddress = "kolkata")
    println(myStudent.name)
    myStudent.name="Khanna"
    println(myStudent.name)
    println(myTeacher.age)
    myStudent.name="Ansari"
    println(myStudent.name)


}