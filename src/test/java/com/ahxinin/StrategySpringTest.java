package com.ahxinin;

import cn.hutool.json.JSONUtil;
import com.ahxinin.strategy.annotation.ItemList;
import com.ahxinin.strategy.annotation.ItemQueryFactory;
import com.ahxinin.strategy.annotation.ItemQueryService;
import com.ahxinin.strategy.spring.ShopRankHandler;
import com.ahxinin.strategy.spring.ShopRankHandlerFactory;
import com.ahxinin.strategy.spring.ShopTypeEnum;
import java.util.List;
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
public class StrategySpringTest {

    @Autowired
    private ShopRankHandlerFactory shopRankHandlerFactory;

    @Test
    public void test(){
        String type = ShopTypeEnum.JD.getType();
        ShopRankHandler shopRankHandler = shopRankHandlerFactory.getStrategy(type);
        String rank = shopRankHandler.calculate();
        log.info(rank);
    }
}
