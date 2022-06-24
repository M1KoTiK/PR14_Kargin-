package com.example.pr14_kargin

import android.app.Activity
import android.os.Bundle
import com.example.pr14_kargin.databinding.ActivityShowItemBinding

class ShowItem : Activity() {

    private lateinit var binding: ActivityShowItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}