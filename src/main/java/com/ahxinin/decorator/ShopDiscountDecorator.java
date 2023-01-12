package com.ahxinin.decorator;

/**
 * 定义具体装饰者A：增加店铺折扣八折
 */
public class ShopDiscountDecorator extends ItemAbstractDecorator{

    public ShopDiscountDecorator(ItemComponent itemComponent) {
        super(itemComponent);
    }

    @Override
    public double checkoutPrice() {
        return super.checkoutPrice() * 0.8;
    }
}
