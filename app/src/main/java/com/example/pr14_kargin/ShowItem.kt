package com.example.pr14_kargin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.pr14_kargin.databinding.ActivityShowItemBinding

class ShowItem : Activity() {

    private lateinit var binding: ActivityShowItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnBack = findViewById<ImageView>(R.id.btn_back_borsh)
        btnBack.setOnClickListener {
            val intent = Intent(this, Table::class.java)
            startActivity(intent)
        }
    }
}