package com.ahxinin.strategy;

/**
 * 策略模式
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class StrategyPattern {

    public static void main(String[] args){
        String type = "A";
        Strategy strategy = StrategyFactory.getStrategy(type);
        strategy.algorithm();
    }
}
