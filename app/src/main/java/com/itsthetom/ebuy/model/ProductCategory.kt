package com.itsthetom.ebuy.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductCategory(
    val productId:Int,
    val categoryName:String
):Parcelable