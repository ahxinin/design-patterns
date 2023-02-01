package com.ahxinin;

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
public class StrategySimpleTest {

    @Autowired
    private StrategyFactory strategyFactory;

    @Test
    public void test(){
        String type = "A";
        Strategy strategy = strategyFactory.getStrategy(type);
        strategy.algorithm();
    }
}
