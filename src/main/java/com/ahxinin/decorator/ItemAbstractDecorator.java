package com.ahxinin.decorator;

/**
 * 定义抽象装饰者：创建抽象构件构造方法，给具体构件增加功能
 */
public class ItemAbstractDecorator implements ItemComponent{

    protected ItemComponent itemComponent;

    public ItemAbstractDecorator(ItemComponent itemComponent){
        this.itemComponent = itemComponent;
    }

    @Override
    public double checkoutPrice() {
        return this.itemComponent.checkoutPrice();
    }
}
