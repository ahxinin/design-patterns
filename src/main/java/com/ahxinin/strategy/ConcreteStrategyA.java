package com.ahxinin.strategy;

/**
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void algorithm() {
        System.out.println("具体策略A的策略方法");
    }
}
