package com.ahxinin.strategy;

import com.ahxinin.strategy.spring.ShopRankHandler;
import com.ahxinin.strategy.spring.ShopRankHandlerFactory;
import com.ahxinin.strategy.spring.ShopTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring ApplicationContext 方式实现策略模式
 * @Author: hexin
 * @Date: 2024/5/23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringStrategyPatternTest {

    @Autowired
    private ShopRankHandlerFactory shopRankHandlerFactory;

    @Test
    public void test(){
        //京东店铺
        String jdType = ShopTypeEnum.JD.getType();
        ShopRankHandler jdShopRankHandler = shopRankHandlerFactory.getStrategy(jdType);
        String jdRank = jdShopRankHandler.calculate();
        log.info("jdRank:{}", jdRank);

        //淘宝店铺
        String tbType = ShopTypeEnum.TB.getType();
        ShopRankHandler tbShopRankHandler = shopRankHandlerFactory.getStrategy(tbType);
        String tbRank = tbShopRankHandler.calculate();
        log.info("tbRank:{}", tbRank);
    }
}