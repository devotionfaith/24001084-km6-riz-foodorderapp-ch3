package com.devotion.foodorderapp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devotion.foodorderapp.R
import com.devotion.foodorderapp.adapter.CategoryAdapter
import com.devotion.foodorderapp.adapter.MenuAdapter
import com.devotion.foodorderapp.data.model.Category
import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var categoryadapter = CategoryAdapter()
    private var menuadapter = MenuAdapter()
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListMenu()
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.ic_cat_rice, name = "Nasi"),
            Category(image = R.drawable.ic_cat_noodles, name = "Mie"),
            Category(image = R.drawable.ic_cat_snack, name = "Snack"),
            Category(image = R.drawable.ic_cat_beverages, name = "Minum"),
            Category(image = R.drawable.ic_cat_pastry, name = "Pastry"),
            Category(image = R.drawable.ic_cat_dessert, name = "Dessert")
        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.categoryadapter
        }
        categoryadapter.submitData(data)
    }

    private fun setListMenu() {
        val data = listOf(
            Menu(image = R.drawable.ic_menu_1, price = 50000.0, name = "Ayam Goreng"),
            Menu(image = R.drawable.ic_menu_2, price = 40000.0, name = "Ayam Geprek"),
            Menu(image = R.drawable.ic_menu_3, price = 40000.0, name = "Ayam Bakar"),
            Menu(image = R.drawable.ic_menu_4, price = 15000.0, name = "Sate Ayam"),
            Menu(image = R.drawable.ic_menu_5, price = 20000.0, name = "Nasi Kuning"),
            Menu(image = R.drawable.ic_menu_6, price = 18000.0, name = "Nasi Goreng"),
            Menu(image = R.drawable.ic_menu_7, price = 22000.0, name = "Nila Goreng"),
            Menu(image = R.drawable.ic_menu_8, price = 18000.0, name = "Nasi Bakar"),
        )
        binding.rvMenu.apply {
            adapter = this@MainActivity.menuadapter
        }
        menuadapter.submitData(data)
    }
}