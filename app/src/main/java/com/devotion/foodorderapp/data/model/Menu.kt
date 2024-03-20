package com.devotion.foodorderapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Menu (
    var id: String = UUID.randomUUID().toString(),
    var image: Int,
    var name: String,
    var price: Double,
    var details: String,
    var locationAddress: String,
    var locationUrl: String
) : Parcelable