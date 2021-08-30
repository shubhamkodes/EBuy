package com.itsthetom.ebuy.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.itsthetom.ebuy.R
import com.itsthetom.ebuy.databinding.ItemProductBinding
import com.itsthetom.ebuy.model.Product

class ProductAdapter(val onClick:(Product,View)->Unit):ListAdapter<Product,ProductAdapter.ProductViewHolder> (ProductDiffUtil){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_product,parent,false))
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       val product=getItem(position)
       holder.binding.apply {
           tvPrice.text=product.productPrice
           tvSize.text=product.productQty
           tvProdName.text=product.productName
           ivProdImg.setImageResource(product.imageUrl)
           ivProdImg.setOnClickListener{
               onClick(product,ivProdImg)
           }
       }
    }


    inner class ProductViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding=ItemProductBinding.bind(view)
    }

    object ProductDiffUtil:DiffUtil.ItemCallback<Product>(){
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.productId==newItem.productId
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.productId==newItem.productId
        }

    }

}