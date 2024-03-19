package com.devotion.foodorderapp.presentation.menulist.adapter

import androidx.recyclerview.widget.RecyclerView
import com.devotion.foodorderapp.base.ViewHolderBinder
import com.devotion.foodorderapp.data.model.Category
import com.devotion.foodorderapp.databinding.ItemCategoryBinding

class CategoryItemViewHolder(private val binding: ItemCategoryBinding
): RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Category> {
    override fun bind(item: Category) {
        item.let{
            binding.ivCategoryImage.setImageResource(it.image)
            binding.tvCategoryName.text = it.name
        }
    }
}