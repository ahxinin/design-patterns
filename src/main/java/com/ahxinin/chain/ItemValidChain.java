package com.ahxinin.chain;

import org.springframework.stereotype.Component;

/**
 * @author : Kane
 * @description: 商品校验
 * @date : 2023-01-29
 */
@Component
public class ItemValidChain extends AbstractChainSupport{

    @Override
    public ValidResult execute(ExecuteChain executeChain) {
        //校验逻辑
        ItemRequest itemRequest = (ItemRequest) executeChain;
        if (itemRequest.getName().length() < 10){
            return ValidResult.error("length is to small");
        }
        return extend(executeChain);
    }

    @Override
    public ValidResult extend(ExecuteChain executeChain) {
        return executeNextChain(executeChain);
    }

    @Override
    public int order() {
        return 1;
    }

    @Override
    public String[] service() {
        return new String[]{"addItem"};
    }
}
