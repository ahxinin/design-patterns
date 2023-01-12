package com.ahxinin.decorator;

/**
 * 调用入口
 */
public class userPayForItem {

    public static void main(String[] args){
        ItemComponent itemComponent = new ConcreteItemComponent();
        System.out.println("原价："+itemComponent.checkoutPrice());

        itemComponent = new ShopDiscountDecorator(itemComponent);
        System.out.println("使用店铺折扣后价格："+itemComponent.checkoutPrice());

        itemComponent = new FullReductionDecorator(itemComponent);
        System.out.println("使用满100减10后价格："+itemComponent.checkoutPrice());

        itemComponent = new BybtCouponDecorator(itemComponent);
        System.out.println("使用百亿补贴优惠券后价格："+itemComponent.checkoutPrice());
    }
}
