package com.ahxinin.strategy;

import com.ahxinin.strategy.simple.Strategy;
import com.ahxinin.strategy.simple.StrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 策略模式
 * @Author: hexin
 * @Date: 2021/1/22
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SimpleStrategyPatternTest {

    @Autowired
    private StrategyFactory strategyFactory;

    @Test
    public void test(){
        //策略A
        Strategy strategyA = strategyFactory.getStrategy("A");
        strategyA.algorithm();

        //策略B
        Strategy strategyB = strategyFactory.getStrategy("B");
        strategyB.algorithm();
    }
}
