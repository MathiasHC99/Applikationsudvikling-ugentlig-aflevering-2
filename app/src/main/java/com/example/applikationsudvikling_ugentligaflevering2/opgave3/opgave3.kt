package com.example.applikationsudvikling_ugentligaflevering2.opgave3

fun main() {
    val shoe = Shoe("Running shoe", 599.9, 15)
    shoe.displayProductInfo()
    shoe.identifyProductCategory()

    println("_______________________________")

    val tshirt = Tshirt("Cool Tshirt", 149.9, 10)
    tshirt.displayProductInfo()
    tshirt.identifyProductCategory()


    println("_______________________________")

    val watermelon = Food("A cool watermelon", 25.0, 54)
    watermelon.displayProductInfo()
    watermelon.identifyProductCategory()
}