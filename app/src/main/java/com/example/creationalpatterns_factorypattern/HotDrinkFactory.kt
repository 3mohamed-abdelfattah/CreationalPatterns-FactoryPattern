package com.example.creationalpatterns_factorypattern

class HotDrinkFactory {
    fun createDrink(name: String): HotDrink {
        return when (name) {
            "Coffee" -> Coffee()
            "Latte" -> Latte()
            "Mocha" -> Mocha()
            else -> throw Exception("Unknown")
        }
    }
}