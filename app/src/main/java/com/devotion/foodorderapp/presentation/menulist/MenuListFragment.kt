package com.devotion.foodorderapp.presentation.menulist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.devotion.foodorderapp.R
import com.devotion.foodorderapp.data.dataSource.CategoryDataSource
import com.devotion.foodorderapp.data.dataSource.CategoryDataSourceImpl
import com.devotion.foodorderapp.data.dataSource.MenuDataSource
import com.devotion.foodorderapp.data.dataSource.MenuDataSourceImpl
import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.databinding.FragmentMenuListBinding
import com.devotion.foodorderapp.presentation.menudetail.DetailActivity
import com.devotion.foodorderapp.presentation.menulist.adapter.CategoryAdapter
import com.devotion.foodorderapp.presentation.menulist.adapter.MenuAdapter
import com.devotion.foodorderapp.presentation.menulist.adapter.OnItemCLickedListener

class MenuListFragment : Fragment() {
    private lateinit var binding: FragmentMenuListBinding
    private var isUsingGridMode: Boolean = true
    private var menuAdapter: MenuAdapter? = null
    private var categoryAdapter: CategoryAdapter? = null
    private val menuDataSource: MenuDataSource by lazy {
        MenuDataSourceImpl()
    }
    private val categoryDataSource: CategoryDataSource by lazy {
        CategoryDataSourceImpl()
    }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindMenuList(isUsingGridMode)
        bindCategory()
        setClickAction()
    }

    private fun setClickAction() {
        binding.ivChangeLayout.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            setIcon(isUsingGridMode)
            bindMenuList(isUsingGridMode)
        }
    }

    private fun setIcon(usingGridMode: Boolean) {
        binding.ivChangeLayout.setImageResource(if (usingGridMode) R.drawable.ic_list else R.drawable.ic_grid)
    }

    private fun bindCategory() {
        categoryAdapter = CategoryAdapter()
        binding.rvCategory.apply {
            adapter = this@MenuListFragment.categoryAdapter
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        categoryAdapter?.submitDataCategory(categoryDataSource.getCategory())
    }

    private fun bindMenuList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) MenuAdapter.MODE_GRID else MenuAdapter.MODE_LIST
        menuAdapter = MenuAdapter(
            listMode = listMode,
            listener = object : OnItemCLickedListener<Menu> {
                override fun onItemClicked(item: Menu) {
                    navigateToDetail(item)
                }
            }
        )
        binding.rvMenu.apply {
            adapter = this@MenuListFragment.menuAdapter
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGrid) 2 else 1)
        }
        menuAdapter?.submitData(menuDataSource.getDataMenu())
    }

    private fun navigateToDetail(item: Menu) {
        DetailActivity.startActivity(
            requireContext(),
            item
        )
    }
}