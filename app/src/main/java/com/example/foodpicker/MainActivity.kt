package com.example.foodpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodTxt.text = ""
        var foods = arrayOf("Burger King", "Mc Donald's", "Papa John's", "Little Caesar", "Bon Ice Cream")

        decideBtn.

        selectedFoodTxt.text = foods.random()
    }
}
