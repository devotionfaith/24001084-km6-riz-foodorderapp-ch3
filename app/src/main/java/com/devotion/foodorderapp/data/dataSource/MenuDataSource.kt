package com.devotion.foodorderapp.data.dataSource

import com.devotion.foodorderapp.data.model.Menu
import com.devotion.foodorderapp.R.*


interface MenuDataSource {
    fun getDataMenu(): List<Menu>
}

class MenuDataSourceImpl(): MenuDataSource{
    override fun getDataMenu(): List<Menu> {
        return mutableListOf(
            Menu(image = drawable.img_ayam_goreng,
                price = 50000.0,
                name = "Ayam Goreng",
                details = "Ayam goreng adalah hidangan yang populer di seluruh dunia, terutama di Indonesia. Potongan ayam yang segar dicelupkan dalam bumbu rempah-rempah khas, kemudian digoreng hingga kecokelatan dan renyah di luar serta juicy di dalam. Proses penggorengan ini menghasilkan aroma yang menggugah selera dan rasa yang kaya akan rempah-rempah. Ayam goreng biasanya disajikan dengan nasi putih hangat dan sambal untuk menambah cita rasa.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_ayam_geprek,
                price = 40000.0,
                name = "Ayam Geprek",
                details = "Ayam geprek adalah hidangan yang terdiri dari potongan ayam goreng yang dihancurkan dan disajikan dengan sambal pedas yang khas. Setelah digoreng hingga matang dan renyah, potongan ayam kemudian dihancurkan dengan alat khusus atau sederhana dengan tangan. Sambal pedas yang melekat pada ayam menambah sensasi pedas dan menggugah selera. Hidangan ini sering disajikan dengan nasi putih hangat dan beberapa lalapan segar.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_ayam_bakar,
                price = 40000.0,
                name = "Ayam Bakar",
                details ="Ayam bakar adalah hidangan yang disiapkan dengan memanggang ayam yang telah direndam dalam bumbu khusus. Proses pemanggangan ini memberikan rasa yang kaya dan tekstur yang lembut pada daging ayam. Bumbu yang digunakan biasanya terdiri dari campuran rempah-rempah tradisional seperti ketumbar, kunyit, jahe, dan bawang putih yang memberikan aroma yang harum dan cita rasa yang khas. Ayam bakar sering kali disajikan dengan nasi hangat, lalapan segar, dan sambal untuk menambah kenikmatan rasa.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_sate_ayam,
                price = 15000.0,
                name = "Sate Ayam",
                details = "Sate ayam adalah hidangan yang terdiri dari potongan daging ayam yang ditusuk dengan tusukan bambu atau sate, kemudian dipanggang di atas bara api. Daging ayam yang telah direndam dalam bumbu kacang atau bumbu kecap khas Indonesia ini menghasilkan cita rasa yang kaya dan lezat. Sate ayam sering disajikan dengan bumbu kacang, irisan bawang merah, dan lontong atau nasi putih.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_kuning,
                price = 20000.0,
                name = "Nasi Kuning" ,
                details = "Nasi kuning adalah hidangan nasi yang dimasak bersama dengan kunyit dan santan, memberikan warna kuning yang khas. Nasi kuning sering kali disajikan dalam bentuk tumpeng atau dibentuk secara khusus untuk perayaan atau acara istimewa. Hidangan ini biasanya disajikan dengan pelengkap seperti ayam goreng, telur dadar, kacang teri, irisan timun, dan kerupuk, sehingga memberikan pengalaman makan yang lengkap dan lezat.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_goreng,
                price = 18000.0,
                name = "Nasi Goreng",
                details = "Nasi goreng adalah hidangan nasi yang digoreng bersama dengan bumbu-bumbu, sayuran, dan daging atau seafood. Proses penggorengan ini memberikan rasa yang kaya dan tekstur yang lezat pada nasi. Bumbu yang digunakan biasanya mencakup kecap manis, bawang putih, bawang merah, dan cabe yang memberikan cita rasa yang khas. Nasi goreng sering disajikan dengan telur mata sapi di atasnya, irisan mentimun, dan kerupuk sebagai pelengkapnya.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nila_goreng,
                price = 22000.0,
                name = "Nila Goreng",
                details = "Nila goreng adalah hidangan yang terdiri dari ikan nila segar yang dibumbui, kemudian digoreng hingga kecokelatan dan renyah. Kulit ikan yang cokelat keemasan dan dagingnya yang lembut serta gurih membuat hidangan ini menjadi favorit banyak orang. Nila goreng biasanya disajikan dengan nasi putih hangat, sambal, dan lalapan segar untuk menyempurnakan rasanya.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Menu(image = drawable.img_nasi_bakar,
                price = 18000.0,
                name = "Nasi Bakar",
                details = "Nasi bakar adalah hidangan nasi yang dibungkus dalam daun pisang atau daun kelapa, kemudian dipanggang di atas bara api. Nasi yang telah dicampur dengan rempah-rempah dan bahan lainnya seperti potongan daging atau seafood, kemudian dibungkus dan dipanggang hingga aroma harum tercium dan nasi matang sempurna. Nasi bakar sering kali disajikan dengan sambal dan irisan timun untuk menambah kesegaran rasanya.",
                locationAddress = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77")
        )
    }
}