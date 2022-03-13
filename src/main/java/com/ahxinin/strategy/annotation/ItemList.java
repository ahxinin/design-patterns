package com.ahxinin.strategy.annotation;

import lombok.Builder;
import lombok.Data;

/**
 * @author : hexin
 * @description: 商品列表
 * @date : 2022-03-13
 */
@Data
@Builder
public class ItemList {

    private String name;

    private Integer price;

    private Integer stock;
}
