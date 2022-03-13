package com.ahxinin.strategy.annotation;

import java.util.List;

/**
 * @author : hexin
 * @description: 商品查询
 * @date : 2022-02-23
 */
public interface ItemQueryService {

    /**
     * 查询商品列表
     */
    List<ItemList> query();
}
