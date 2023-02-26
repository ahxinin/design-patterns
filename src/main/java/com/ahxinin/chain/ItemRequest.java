package com.ahxinin.chain;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: 商品请求参数
 * @date : 2023-01-29
 */
@Setter
@Getter
public class ItemRequest implements ExecuteChain{

    private String name;

    @Override
    public boolean enable() {
        return true;
    }

    @Override
    public String service() {
        return "addItem";
    }
}
