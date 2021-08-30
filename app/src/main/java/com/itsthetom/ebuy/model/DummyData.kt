package com.itsthetom.ebuy.model

import com.itsthetom.ebuy.R

object DummyData {
    val subCategories= listOf(
        ProductCategory(1,"Popular"),
        ProductCategory(1,"All Body Products"),
        ProductCategory(1,"Latest"),
        ProductCategory(1,"Top Rated"),
        ProductCategory(1,"Trending")
    )

    val products= listOf(
        Product(1,"Japnese Cherry Blossom","250 ml","$ 17.00",R.drawable.prod2),
        Product(2,"African Banana Shower Gel","350 ml","$ 69.00",R.drawable.prod1),
        Product(3,"Japnese Cherry Blossom","250 ml","$ 17.00",R.drawable.prod2),
        Product(4,"African Banana Shower Gel","350 ml","$ 69.00",R.drawable.prod1),
        Product(5,"Japnese Cherry Blossom","250 ml","$ 17.00",R.drawable.prod2),
        Product(6,"African Banana Shower Gel","350 ml","$ 69.00",R.drawable.prod1),

    )
}
