package com.leon.myshopinglist.domain.usecase

import com.leon.myshopinglist.domain.entity.ShopItem
import com.leon.myshopinglist.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    operator fun invoke(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(id = shopItemId)
    }
}