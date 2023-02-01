package com.ahxinin.strategy.spring;

import org.springframework.stereotype.Service;

/**
 * @author : Kane
 * @description: tb策略实现类
 * @date : 2023-02-01
 */
@Service
public class TbShopRankHandlerImpl implements ShopRankHandler{

    @Override
    public String getType() {
        return ShopTypeEnum.TB.getType();
    }

    @Override
    public String calculate() {
        return "1000";
    }
}
