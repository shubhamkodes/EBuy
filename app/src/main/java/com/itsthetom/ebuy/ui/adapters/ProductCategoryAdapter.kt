package com.itsthetom.ebuy.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.itsthetom.ebuy.R
import com.itsthetom.ebuy.databinding.ItemProductCategoryBinding
import com.itsthetom.ebuy.model.ProductCategory

class ProductCategoryAdapter(val onClick:(ProductCategory)->Unit):ListAdapter<ProductCategory,ProductCategoryAdapter.CategoryViewHolder>(CategoryDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       return CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_product_category,parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category=getItem(position)
        holder.binding.apply {
            tvCategoryName.text=category.categoryName
            root.setOnClickListener{
                onClick(category)
            }
        }
    }


    inner class CategoryViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding=ItemProductCategoryBinding.bind(view)
    }

    object CategoryDiffUtil:DiffUtil.ItemCallback<ProductCategory>(){
        override fun areItemsTheSame(oldItem: ProductCategory, newItem: ProductCategory): Boolean {
            return oldItem.productId==newItem.productId
        }

        override fun areContentsTheSame(
            oldItem: ProductCategory,
            newItem: ProductCategory
        ): Boolean {
           return oldItem.productId==newItem.productId && oldItem.categoryName==newItem.categoryName
        }
    }

}