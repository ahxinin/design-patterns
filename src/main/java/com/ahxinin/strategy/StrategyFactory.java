package com.ahxinin.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : hexin
 * @description: 策略工厂
 * @date : 2022-01-30
 */
public class StrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type){
        return strategies.get(type);
    }
}
