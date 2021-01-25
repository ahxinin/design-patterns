package com.ahxinin.factory;

/**
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class ConcreteProductA implements Product{

    @Override
    public void use() {
        System.out.println("具体产品A");
    }
}
