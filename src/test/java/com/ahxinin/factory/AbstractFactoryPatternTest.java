package com.ahxinin.factory;

import com.ahxinin.factory.abstractfactory.MenFactory;
import com.ahxinin.factory.abstractfactory.WomenFactory;

/**
 * @description: 抽象工厂模式测试类
 * @date : 2024-05-23
 */
public class AbstractFactoryPatternTest {

    public static void main(String[] args){
        MenFactory menFactory = new MenFactory();
        WomenFactory womenFactory = new WomenFactory();

        //男装搜索
        menFactory.exhibitShirt().Show();
        menFactory.exhibitTrousers().Show();
        //女装搜索
        womenFactory.exhibitShirt().Show();
        womenFactory.exhibitTrousers().Show();
    }
}
