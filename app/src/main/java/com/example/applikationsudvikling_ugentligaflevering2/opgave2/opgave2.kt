package com.example.applikationsudvikling_ugentligaflevering2.opgave2

fun main() {
    val laptop = Laptop("Huawei", "Intel core i3", 16, 8)
    laptop.turnOn()
    laptop.displaySpecs()
    laptop.showBatteryStatus()


println("___________________________________________________")

    val smartPhone = SmartPhone("Google pixel", "Google Tensor G3", 8, 50)
    smartPhone.turnOn()
    smartPhone.displaySpecs()
    smartPhone.takePicture()
}
