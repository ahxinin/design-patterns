package com.ahxinin.strategy;

import cn.hutool.json.JSONUtil;
import com.ahxinin.strategy.annotation.ItemList;
import com.ahxinin.strategy.annotation.ItemQueryFactory;
import com.ahxinin.strategy.annotation.ItemQueryService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 注解实现策略模式
 * @Author: hexin
 * @Date: 2024/5/23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AnnotationStrategyPatternTest {

    @Autowired
    private ItemQueryFactory itemQueryFactory;

    @Test
    public void test(){
        // 查询商品价格
        String priceName = "priceQueryService";
        ItemQueryService itemPriceQueryService = itemQueryFactory.getByName(priceName);
        List<ItemList> itemPriceList = itemPriceQueryService.query();
        log.info("itemPriceList:{}", itemPriceList);

        String stockName = "stockQueryService";
        ItemQueryService itemStockQueryService = itemQueryFactory.getByName(stockName);
        List<ItemList> itemStockList = itemStockQueryService.query();
        log.info("itemStockList:{}", itemStockList);
    }
}
