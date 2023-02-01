package com.ahxinin.strategy.simple;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * @author : hexin
 * @description: 策略工厂
 * @date : 2022-01-30
 */
@Component
public class StrategyFactory {

    /**
     * 初始化策略bean
     */
    private static  Map<String, Strategy> STRATEGIES_MAP = ImmutableMap.<String, Strategy>builder()
            .put("A", new ConcreteStrategyA())
            .put("B", new ConcreteStrategyB())
            .build();

    public Strategy getStrategy(String type){
        return STRATEGIES_MAP.get(type);
    }
}
