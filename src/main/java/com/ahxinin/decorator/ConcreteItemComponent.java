package com.ahxinin.decorator;

/**
 * 定义具体构件：具体商品
 */
public class ConcreteItemComponent implements ItemComponent{

    /**
     * 原价
     */
    @Override
    public double checkoutPrice() {
        return 100.0;
    }
}
