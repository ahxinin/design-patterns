package com.ahxinin.factory;

/**
 * 具体工厂A
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class ConcreteFactoryA implements Factory{

    @Override
    public Product createProduct() {
        System.out.println("具体工厂A -> 生成产品A");
        return new ConcreteProductA();
    }
}
