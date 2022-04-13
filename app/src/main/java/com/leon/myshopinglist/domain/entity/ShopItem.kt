package com.leon.myshopinglist.domain.entity

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean = true
)
