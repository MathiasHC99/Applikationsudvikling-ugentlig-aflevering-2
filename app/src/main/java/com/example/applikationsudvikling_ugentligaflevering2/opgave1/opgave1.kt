package com.example.applikationsudvikling_ugentligaflevering2.opgave1

fun main() {
    val employee1 = Employee("Casper", "Smith", 3000.0)
    val employee2 = Employee("Jesper","McMuffin", -1250.0)
    val employee3 = Employee("John","Doe", 1000.0)


    println("Initial salaries:")
    employee1.displayInfo()
    employee2.displayInfo()
    employee3.displayInfo()

    employee1.giveRaise(10.0)
    employee2.giveRaise(10.0)
    employee3.giveRaise(10.0)

    println("_____________________________")

    println("\nsalaries after 10% raise:")
    employee1.displayInfo()
    employee2.displayInfo()
    employee3.displayInfo()
}