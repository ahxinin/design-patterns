package com.ahxinin.factory;

/**
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class ConcreteFactoryB implements Factory{

    @Override
    public Product createProduct() {
        System.out.println("具体工厂B->生成产品B");
        return new ConcreteProductB();
    }
}
