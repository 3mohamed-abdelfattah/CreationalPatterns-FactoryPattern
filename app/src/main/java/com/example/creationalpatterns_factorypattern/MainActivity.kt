package com.example.creationalpatterns_factorypattern

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val factory = HotDrinkFactory()
        val myDrink1 = factory.createDrink("Coffee")
        val myDrink2 = factory.createDrink("Mocha")

        Log.d("DRINK", myDrink1::class.java.simpleName)
        Log.d("DRINK", myDrink2::class.java.simpleName)
        myDrink2.drink()
    }
}