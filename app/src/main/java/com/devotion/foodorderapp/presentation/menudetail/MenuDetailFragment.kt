package com.devotion.foodorderapp.presentation.menudetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devotion.foodorderapp.R
import com.devotion.foodorderapp.databinding.FragmentMenuDetailBinding

class MenuDetailFragment : Fragment() {

    private lateinit var binding : FragmentMenuDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}