package com.devotion.foodorderapp.presentation.menulist.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.devotion.foodorderapp.base.ViewHolderBinder
import com.devotion.foodorderapp.base.toIndonesianFormat
import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.databinding.ItemMenuListBinding

class MenuListItemViewHolder(
    private val binding: ItemMenuListBinding
):ViewHolder(binding.root), ViewHolderBinder<Menu> {
    override fun bind(item: Menu) {
        item.let{
            binding.ivMenuImage.setImageResource(it.image)
            binding.tvMenuName.text = it.name
            binding.tvMenuPrice.text = it.price.toIndonesianFormat()
            binding.tvMenuLocation.text= it.locationAddress
        }
    }
}