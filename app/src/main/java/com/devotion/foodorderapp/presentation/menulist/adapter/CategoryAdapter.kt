package com.devotion.foodorderapp.presentation.menulist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.devotion.foodorderapp.base.ViewHolderBinder
import com.devotion.foodorderapp.data.model.Category
import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.databinding.ItemCategoryBinding

class CategoryAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var asyncDataDiffer = AsyncListDiffer(
        this, object : DiffUtil.ItemCallback<Category>() {
            override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem.hashCode() == oldItem.hashCode()
            }
        }
    )

    fun submitDataCategory(data: List<Category>) {
        asyncDataDiffer.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CategoryItemViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = asyncDataDiffer.currentList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder !is ViewHolderBinder<*>) return
        (holder as ViewHolderBinder<Category>).bind(asyncDataDiffer.currentList[position])
    }
}