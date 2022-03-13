package com.ahxinin.strategy.annotation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : hexin
 * @description: 商品服务
 * @date : 2022-02-16
 */
@Service
public class ItemService {


    @Autowired
    private ItemQueryFactory siteItemQueryFactory;

    /**
     * 查询营业部商品列表
     */
    public List<ItemList> querySiteItemList(String name){
        // 处理不同查询类型
        ItemQueryService queryService = siteItemQueryFactory.getByName(name);
        return queryService.query();
    }
}
