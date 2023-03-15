package com.example.android_3_dop_2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.android_3_dop_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
        setupObserves()
    }

    private fun initialize() {
        binding.btnGenerate.setOnClickListener {
            viewModel?.getRandomNumber()
        }
    }

    private fun setupObserves() {
        viewModel?.getRandomNumber()?.observe(this) {
            binding.textRandom.text = it.toString()
        }
    }
}