package com.leon.myshopinglist.domain.usecase

import com.leon.myshopinglist.domain.entity.ShopItem
import com.leon.myshopinglist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    operator fun invoke(item: ShopItem): ShopItem {
        return shopListRepository.editShopItem(item = item)
    }
}