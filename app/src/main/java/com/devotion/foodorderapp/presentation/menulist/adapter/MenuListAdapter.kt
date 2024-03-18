package com.devotion.foodorderapp.presentation.menulist.adapter

import com.devotion.foodorderapp.base.ViewHolderBinder
import com.devotion.foodorderapp.base.toIndonesianFormat
import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.databinding.ItemMenuListBinding

class MenuListAdapter(): ViewHolderBinder<Menu> {
    private lateinit var binding: ItemMenuListBinding
    override fun bind(item: Menu) {
        item.let{
            binding.ivMenuImage.setImageResource(it.image)
            binding.tvMenuName.text = it.name
            binding.tvMenuPrice.text = it.price.toIndonesianFormat()
            binding.tvMenuLocation.text= it.locationAddress
        }
    }
}