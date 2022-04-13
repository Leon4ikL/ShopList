package com.leon.myshopinglist.domain.usecase

import com.leon.myshopinglist.domain.entity.ShopItem
import com.leon.myshopinglist.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {
    operator fun invoke(item: ShopItem){
        shopListRepository.removeShopItem(item = item)
    }
}