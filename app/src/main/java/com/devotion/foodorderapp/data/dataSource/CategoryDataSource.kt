package com.devotion.foodorderapp.data.dataSource

import com.devotion.foodorderapp.data.model.Category
import com.devotion.foodorderapp.R.*

interface CategoryDataSource {
    fun getCategory(): List<Category>
}

class CategoryDataSourceImpl : CategoryDataSource{
    override fun getCategory(): List<Category> {
        return mutableListOf(
            Category(image = drawable.ic_cat_rice, name = "Nasi"),
            Category(image = drawable.ic_cat_noodles, name = "Mie"),
            Category(image = drawable.ic_cat_snack, name = "Snack"),
            Category(image = drawable.ic_cat_beverages, name = "Minum"),
            Category(image = drawable.ic_cat_pastry, name = "Pastry"),
            Category(image = drawable.ic_cat_dessert, name = "Dessert")
        )
    }

}

