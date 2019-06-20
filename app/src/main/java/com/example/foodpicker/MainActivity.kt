package com.example.foodpicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodTxt.text = "Select a food"
        val foods = arrayListOf(Food("Pizza",800))

        decideBtn.setOnClickListener {
            var random = Random().nextInt(foods.size)
            var selectedFood = foods[random]
            selectedFoodTxt.text = selectedFood.name
            foodPriceLabel.text = selectedFood.price.toString()
        }

        addFoodBtn.setOnClickListener {
            val foodName = foodNameTxt.text.toString()
            val foodPrice = foodPriceTxt.text.toString()
            val food = Food(name = foodName, price = foodPrice.toInt())
            foods.add(food)
            foodNameTxt.text.clear()
            foodPriceTxt.text.clear()
        }
    }
}

data class Food(val name: String, val price: Int)
