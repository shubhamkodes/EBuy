package com.itsthetom.ebuy.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itsthetom.ebuy.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}