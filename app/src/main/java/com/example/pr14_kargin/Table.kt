package com.example.pr14_kargin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.pr14_kargin.databinding.ActivityTableBinding

class Table : Activity() {

    private lateinit var binding: ActivityTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnBorsh = findViewById<LinearLayout>(R.id.btn_lin_borsh)
        btnBorsh.setOnClickListener{
            val intent = Intent(this, ShowItem::class.java)
            startActivity(intent)
        }
        val btnBack = findViewById<ImageView>(R.id.btn_back)
        btnBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}