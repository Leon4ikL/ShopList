package com.leon.myshopinglist.domain.usecase

import com.leon.myshopinglist.domain.entity.ShopItem
import com.leon.myshopinglist.domain.repository.ShopListRepository

class GetShopItemListUseCase(private val shopListRepository: ShopListRepository) {
    operator fun invoke() : List<ShopItem>{
        return shopListRepository.getShopItemList()
    }
}