package com.ahxinin.strategy;

/**
 * 策略模式
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class StrategyPattern {

    public static void main(String[] args){
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.algorithm();

        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.algorithm();
    }
}
