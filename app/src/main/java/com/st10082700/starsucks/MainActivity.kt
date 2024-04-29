package com.st10082700.starsucks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.st10082700.starsucks.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSb1.setOnClickListener() {
            Toast.makeText(this@MainActivity, "MMM Soy Latte", Toast.LENGTH_SHORT).show()

            binding.imgSb2.setOnClickListener() {
                Toast.makeText(this@MainActivity, "MMM Chocco Frappe", Toast.LENGTH_SHORT).show()
            }

            binding.imgSb3.setOnClickListener() {
                Toast.makeText(this@MainActivity, " MMM Bottled Americano", Toast.LENGTH_SHORT).show()
            }

            binding.imgSb4.setOnClickListener() {
                Toast.makeText(this@MainActivity, " MMM Rainbow Frappe", Toast.LENGTH_SHORT).show()
            }

            binding.imgSb5.setOnClickListener() {
                Toast.makeText(this@MainActivity, "MMM Caramel Frappe", Toast.LENGTH_SHORT).show()
            }

            binding.imgSb6.setOnClickListener() {
                Toast.makeText(this@MainActivity, "MMM Caramel Frappe", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
