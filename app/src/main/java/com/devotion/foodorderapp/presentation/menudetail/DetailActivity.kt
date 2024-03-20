package com.devotion.foodorderapp.presentation.menudetail

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devotion.foodorderapp.R
import com.devotion.foodorderapp.base.fromCurrencyToDouble
import com.devotion.foodorderapp.base.toIndonesianFormat
import com.devotion.foodorderapp.databinding.ActivityDetailBinding
import com.devotion.foodorderapp.data.model.Menu as Menu

class DetailActivity : AppCompatActivity() {
    private var amount: Int = 1
    private var location: String = "Dummy"

    companion object {
        const val EXTRAS_ITEM = "EXTRAS_DETAIL_DATA"
        fun startActivity(context: Context, menu: Menu) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRAS_ITEM, menu)
            context.startActivity(intent)
        }
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setOnClick()
        bindMenuDetail()
        updateLayout(amount)
        setContentView(binding.root)
    }

    private fun setOnClick() {
        binding.cvSubstract.setOnClickListener {
            updateAmount(amount - 1)
        }

        binding.cvAdd.setOnClickListener {
            updateAmount(amount + 1)
        }
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.tvLocationAddress.setOnClickListener {
            navigateToMaps()
        }
    }

    private fun navigateToMaps() {
        val gmmIntentUri = Uri.parse(location)
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        startActivity(mapIntent)
    }

    private fun updateAmount(currentAmount: Int) {
        val newAmount = maxOf(0, currentAmount)
        amount = newAmount
        binding.tvAmount.text = newAmount.toString()
        updateLayout(newAmount)
    }

    private fun updateLayout(amount: Int) {
        val price = binding.tvMenuPriceDetails.text.toString().fromCurrencyToDouble() ?: 0.0
        val totalPrice = price * amount
        val formattedTotalPrice = totalPrice.toIndonesianFormat()
        val buttonText = getString(R.string.text_add_to_cart, formattedTotalPrice)
        binding.btnAddToCart.text = buttonText
    }


    private fun bindMenuDetail() {
        intent.extras?.getParcelable<Menu>(EXTRAS_ITEM)?.let {
            location = it.locationUrl
            binding.ivMenuImgDetails.setImageResource(it.image)
            binding.tvMenuNameDetails.text = it.name
            binding.tvMenuPriceDetails.text = it.price.toIndonesianFormat()
            binding.tvMenuDetails.text = it.details
            binding.tvLocationAddress.text = it.locationAddress
        }
    }
}