package com.ahxinin.strategy.spring;

/**
 * @author : Kane
 * @description: 策略接口
 * @date : 2023-02-01
 */
public interface ShopRankHandler {

    /**
     * 获取店铺类型
     * @return 店铺类型
     */
    String getType();

    /**
     * 计算店铺等级
     * @return 店铺等级
     */
    String calculate();
}
