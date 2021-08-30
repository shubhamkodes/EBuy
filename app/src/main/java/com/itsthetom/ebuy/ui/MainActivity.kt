  package com.itsthetom.ebuy.ui

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import com.itsthetom.ebuy.databinding.ActivityMainBinding
import com.itsthetom.ebuy.model.DummyData
import com.itsthetom.ebuy.ui.adapters.ProductAdapter
import com.itsthetom.ebuy.ui.adapters.ProductCategoryAdapter
import androidx.core.util.Pair

  class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var categoryAdapter: ProductCategoryAdapter
    private lateinit var productAdapter:ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdapters()

    }

      private fun setAdapters() {
          categoryAdapter=ProductCategoryAdapter {productCategory ->  
              //Take action
          }
          binding.rvCategory.adapter=categoryAdapter
          categoryAdapter.submitList(DummyData.subCategories)

          productAdapter= ProductAdapter { product,view->
              //Take action
                val pair=Pair(view,"image")
                val activityOptions=ActivityOptionsCompat.makeSceneTransitionAnimation(this,pair)
                startActivity(Intent(this,ProductDetailActivity::class.java),activityOptions.toBundle())
          }
          binding.rvProducts.adapter=productAdapter
          productAdapter.submitList(DummyData.products)

      }
  }