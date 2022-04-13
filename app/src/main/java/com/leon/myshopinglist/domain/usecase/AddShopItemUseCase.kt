package com.leon.myshopinglist.domain.usecase

import com.leon.myshopinglist.domain.entity.ShopItem
import com.leon.myshopinglist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    operator fun invoke(item: ShopItem){
        shopListRepository.addShopItem(item = item)
    }
}