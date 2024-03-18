package com.devotion.foodorderapp.data.dataSource

import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.R.*


interface MenuDataSource {
    fun getDataMenu(): List<Menu>
}

class MenuDataSourceImpl(): MenuDataSource{
    override fun getDataMenu(): List<Menu> {
        return mutableListOf(
            Menu(image = drawable.img_ayam_goreng, price = 50000.0, name = "Ayam Goreng", locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_ayam_geprek, price = 40000.0, name = "Ayam Geprek",locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_ayam_bakar, price = 40000.0, name = "Ayam Bakar",locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_sate_ayam, price = 15000.0, name = "Sate Ayam", locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_kuning, price = 20000.0, name = "Nasi Kuning" , locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_goreng, price = 18000.0, name = "Nasi Goreng", locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nila_goreng, price = 22000.0, name = "Nila Goreng", locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_bakar, price = 18000.0, name = "Nasi Bakar", locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345", locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77")
        )
    }
}