package com.ahxinin;

import com.ahxinin.decorator.BybtCouponDecorator;
import com.ahxinin.decorator.ConcreteItemComponent;
import com.ahxinin.decorator.FullReductionDecorator;
import com.ahxinin.decorator.ItemComponent;
import com.ahxinin.decorator.ShopDiscountDecorator;

/**
 * 装饰者模式测试类
 */
public class DecoratorPatternTest {

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
