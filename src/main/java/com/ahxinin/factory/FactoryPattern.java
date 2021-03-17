package com.ahxinin.factory;

/**
 * 工厂模式
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class FactoryPattern {

    public static void main(String[] args){
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.use();
    }
}