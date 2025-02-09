package com.example.applikationsudvikling_ugentligaflevering2.opgave2

open class Computer(
    val brand: String,
    val processor: String,
    val ramSize: Int
) {
    init {
        println("Computer initialized: $brand with $processor and $ramSize GB RAM")
    }

    fun turnOn() {
        println("$brand is now ON!")
    }

    fun displaySpecs() {
        println("Brand: $brand, processor: $processor, RAM: ${ramSize}GB")
    }


}