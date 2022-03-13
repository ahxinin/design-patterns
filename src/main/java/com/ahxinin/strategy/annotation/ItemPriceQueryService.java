package com.ahxinin.strategy.annotation;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author : hexin
 * @description: 商品价格返回值
 * @date : 2022-02-23
 */
@Service("priceQueryService")
public class ItemPriceQueryService implements ItemQueryService {

    @Override
    public List<ItemList> query() {
        ItemList itemList = ItemList.builder()
                .name("旺仔牛奶")
                .price(100)
                .build();
        return Collections.singletonList(itemList);
    }
}
