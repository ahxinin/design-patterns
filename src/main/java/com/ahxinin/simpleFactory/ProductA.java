package com.ahxinin.simpleFactory;

/**
 * @Author: hexin
 * @Date: 2021/3/17
 */
public class ProductA implements Product{

    @Override
    public void use() {
        System.out.println("Product A");
    }
}
