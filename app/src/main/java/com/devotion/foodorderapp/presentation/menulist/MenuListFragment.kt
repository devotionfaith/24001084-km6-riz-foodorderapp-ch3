package com.devotion.foodorderapp.presentation.menulist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devotion.foodorderapp.R
import com.devotion.foodorderapp.databinding.FragmentMenuListBinding

class MenuListFragment : Fragment() {
    private lateinit var binding: FragmentMenuListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuListBinding.inflate(
            layoutInflater,
            container,
            false
        )
        return binding.root
    }
}