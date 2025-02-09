package com.example.applikationsudvikling_ugentligaflevering2.opgave3

fun main() {
    val shoe = Shoe("Running shoe", 55.50, 15)
    shoe.displayProductInfo()
    shoe.identifyProductCategory()

    println("_______________________________")

    val tshirt = Tshirt("Cool Tshirt", 14.99, 120)
    tshirt.displayProductInfo()
    tshirt.identifyProductCategory()


    println("_______________________________")

    val book = Book("A cool book", 34.99, 20)
    book.displayProductInfo()
    book.identifyProductCategory()
}
