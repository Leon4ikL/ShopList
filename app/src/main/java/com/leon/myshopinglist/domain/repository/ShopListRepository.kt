package com.leon.myshopinglist.domain.repository

import com.leon.myshopinglist.domain.entity.ShopItem

interface ShopListRepository {
    fun addShopItem(item: ShopItem)

    fun getShopItem(id: Int): ShopItem

    fun getShopItemList(): List<ShopItem>

    fun removeShopItem(item: ShopItem)

    fun editShopItem(item: ShopItem): ShopItem
}