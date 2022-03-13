package com.ahxinin.strategy.annotation;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author : hexin
 * @description: 商品库存返回值
 * @date : 2022-02-23
 */
@Service("stockQueryService")
public class ItemStockQueryService implements ItemQueryService {

    @Override
    public List<ItemList> query() {
        ItemList itemList = ItemList.builder()
                .name("可乐")
                .stock(1)
                .build();
        return Collections.singletonList(itemList);
    }
}
