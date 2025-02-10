package com.example.applikationsudvikling_ugentligaflevering2.opgave3

open class Product(
    val name: String,
    val price: Double,
    val quantity: Int
) {

    open fun identifyProductCategory() {
        println(":):)")
    }

    fun displayProductInfo() {
        println("Product name: $name, price: $price, quantity: $quantity")
    }
}