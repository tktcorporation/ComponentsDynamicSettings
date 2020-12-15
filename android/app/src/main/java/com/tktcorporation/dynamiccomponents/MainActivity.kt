package com.tktcorporation.dynamiccomponents

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tktcorporation.dynamiccomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeButton.setOnClickListener {
            val colorString = binding.colorCode.text.toString()
            binding.customButton.setBackgroundColor(Color.parseColor(colorString))
            binding.customButton.setTextColor(Color.parseColor(colorString))
        }
    }
}