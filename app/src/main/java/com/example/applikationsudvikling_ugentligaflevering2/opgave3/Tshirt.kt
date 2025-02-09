package com.example.applikationsudvikling_ugentligaflevering2.opgave3

class Tshirt(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a T-shirt!")
    }
}