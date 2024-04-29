package com.st10082700.starsucks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.st10082700.starsucks.databinding.ActivityOrdersDetailsBinding

class OrdersDetailsActivity : AppCompatActivity() {
    var order = Order()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_details)

        val binding = ActivityOrdersDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get the name of the ordered product from the intent
        order.productName = intent.getStringExtra("order").toString()

        //set the text of the textview to the product name
        binding.tvPlacedOrder.text = order.productName

        when(order.productName) {
            "Soy Latte" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb1)
            "Chocco Frappe" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb2)
            "Bottled Americano" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb3)
            "Rainbow Frappe" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb4)
            "Caramel Frappe" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb5)
            "Black Forest Frappe" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb6)
        }

        binding.fabOrder.setOnClickListener(){
            shareIntent(applicationContext, order.productName)

        }



        }
    }
