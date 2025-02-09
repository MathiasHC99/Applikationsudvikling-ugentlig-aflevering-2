package com.example.applikationsudvikling_ugentligaflevering2.opgave2

class SmartPhone(
    brand: String,
    processor: String,
    ramSize: Int,
    val cameraResolution: Int
) : Computer(brand, processor, ramSize) {

    fun takePicture() {
        println("Taking a picture with $cameraResolution MP")
    }

}