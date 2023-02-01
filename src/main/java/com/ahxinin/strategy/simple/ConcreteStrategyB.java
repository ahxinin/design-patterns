package com.ahxinin.strategy.simple;

/**
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class ConcreteStrategyB implements Strategy{

    @Override
    public void algorithm() {
        System.out.println("具体策略B的策略方法");
    }
}
