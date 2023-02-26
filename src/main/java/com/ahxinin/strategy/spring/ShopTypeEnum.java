package com.ahxinin.strategy.spring;

import lombok.Getter;

/**
 * @description: 店铺类型
 * @date : 2023-02-01
 */
public enum ShopTypeEnum {

    //枚举
    TB("A", "tb"),
    JD("B", "jd")
    ;

    @Getter
    private String type;
    @Getter
    private String desc;

    ShopTypeEnum(String type, String desc){
        this.type = type;
        this.desc = desc;
    }
}
