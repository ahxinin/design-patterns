package com.ahxinin.factory;

import com.ahxinin.factory.completefactory.Factory;
import com.ahxinin.factory.completefactory.MenShirtFactory;
import com.ahxinin.factory.completefactory.WomenShirtFactory;

/**
 * @description: 工厂模式测试类
 * @date : 2024-05-23
 */
public class CompleteFactoryPatternTest {

    public static void main(String[] args) {
        //men shirt
        Factory menShirtFactory = new MenShirtFactory();
        menShirtFactory.exhibit().Show();

        //women shirt
        Factory womenShirtFactory = new WomenShirtFactory();
        womenShirtFactory.exhibit().Show();
    }
}
