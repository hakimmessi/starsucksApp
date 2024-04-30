package com.st10082700.starsucks

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.st10082700.starsucks.databinding.ActivityMainBinding
import android.widget.Toast
import com.st10082700.starsucks.databinding.ActivityMainWithNavDrawerBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var order = Order()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainWithNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSb1.setOnClickListener(this)
        binding.imgSb2.setOnClickListener(this)
        binding.imgSb3.setOnClickListener(this)
        binding.imgSb4.setOnClickListener(this)
        binding.imgSb5.setOnClickListener(this)
        binding.imgSb6.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.img_sb1 -> order.productName = "Soy Latte"
            R.id.img_sb2 -> order.productName = "Chocco Frappe"
            R.id.img_sb3 -> order.productName = "Bottled Americano"
            R.id.img_sb4 -> order.productName = "Rainbow Frappe"
            R.id.img_sb5 -> order.productName = "Caramel Frappe"
            R.id.img_sb6 -> order.productName = "Black Forest Frappe"
        }

        Toast.makeText(this@MainActivity, "MMM" + order.productName, Toast.LENGTH_SHORT).show()
        openIntent(applicationContext, order.productName, OrdersDetailsActivity::class.java)
    }
}
