package com.example.applikationsudvikling_ugentligaflevering2.opgave1

class Employee(
    private val firstName: String,
    private val lastName: String,
    private var monthlySalary: Double
) {
    init {
        if(monthlySalary < 0.0) {
            monthlySalary = 0.0
        }
    }

private fun yearlySalary(): Double {
    return monthlySalary * 12
}

fun giveRaise(percentage: Double) {
    monthlySalary += monthlySalary * (percentage / 100)
}

fun displayInfo() {
    println("Employee: $firstName $lastName")
    println("Yearly salary: ${yearlySalary()}")
}
}
