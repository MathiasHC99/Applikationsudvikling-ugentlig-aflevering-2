package com.example.applikationsudvikling_ugentligaflevering2.opgave2

class Laptop(
    brand: String,
    processor: String,
    ramSize: Int,
    val batteryStatus: Int
) : Computer(brand, processor, ramSize) {
    fun showBatteryStatus() {
        println("Battery life: $batteryStatus hours remaining")
    }
}