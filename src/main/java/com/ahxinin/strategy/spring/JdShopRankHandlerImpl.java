package com.ahxinin.strategy.spring;

import org.springframework.stereotype.Service;

/**
 * @author : Kane
 * @description: jd策略实现类
 * @date : 2023-02-01
 */
@Service
public class JdShopRankHandlerImpl implements ShopRankHandler{

    @Override
    public String getType() {
        return ShopTypeEnum.JD.getType();
    }

    @Override
    public String calculate() {
        return "2000";
    }
}
