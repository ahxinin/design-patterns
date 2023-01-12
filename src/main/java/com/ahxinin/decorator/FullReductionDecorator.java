package com.ahxinin.decorator;

/**
 * 定义具体装饰者B：满100减10
 */
public class FullReductionDecorator extends ItemAbstractDecorator{

    public FullReductionDecorator(ItemComponent itemComponent) {
        super(itemComponent);
    }

    @Override
    public double checkoutPrice() {
        return super.checkoutPrice() - 10;
    }
}
