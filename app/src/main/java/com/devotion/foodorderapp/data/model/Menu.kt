package com.devotion.foodorderapp.data.model

import java.util.UUID

data class Menu (
    var id: String = UUID.randomUUID().toString(),
    var image: Int,
    var name: String,
    var price: Double,
    var locationAddress: String,
    var locationUrl: String
)