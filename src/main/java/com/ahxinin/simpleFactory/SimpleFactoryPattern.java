package com.ahxinin.simpleFactory;

/**
 * 客户端
 * @Author: hexin
 * @Date: 2021/3/17
 */
public class SimpleFactoryPattern {

    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct("A");
        product.use();
    }
}
