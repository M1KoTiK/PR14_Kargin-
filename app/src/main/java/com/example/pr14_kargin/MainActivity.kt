package com.example.pr14_kargin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.pr14_kargin.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNext = findViewById<Button>(R.id.btn_next)
        btnNext.setOnClickListener {
            val intent = Intent(this, Table::class.java)
            startActivity(intent)
        }



    }
}