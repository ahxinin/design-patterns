package com.ahxinin.decorator;

/**
 * 定义具体装饰者C：百亿补贴券20
 */
public class BybtCouponDecorator extends ItemAbstractDecorator{

    public BybtCouponDecorator(ItemComponent itemComponent) {
        super(itemComponent);
    }

    @Override
    public double checkoutPrice() {
        return super.checkoutPrice() - 20;
    }
}