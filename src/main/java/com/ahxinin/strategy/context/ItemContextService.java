package com.ahxinin.strategy.context;

import com.ahxinin.strategy.annotation.ItemList;
import com.ahxinin.strategy.annotation.ItemQueryFactory;
import com.ahxinin.strategy.annotation.ItemQueryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author : hexin
 * @description: 商品服务
 * @date : 2022-02-16
 */
@Service
public class ItemContextService {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 查询营业部商品列表
     */
    public List<ItemList> querySiteItemList(String name){
        ItemQueryService queryService = (ItemQueryService) applicationContext.getBean(name);
        return queryService.query();
    }
}
