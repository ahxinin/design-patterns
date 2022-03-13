package com.ahxinin.strategy.annotation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : hexin
 * @description: 商品查询
 * @date : 2022-03-02
 */
@Service
public class ItemQueryFactory {

    /**
     * 自动注入所有实现类
     */
    @Autowired
    Map<String, ItemQueryService> itemQueryServiceMap = new ConcurrentHashMap<>();

    public ItemQueryService getByName(String name){
        return itemQueryServiceMap.get(name);
    }
}
