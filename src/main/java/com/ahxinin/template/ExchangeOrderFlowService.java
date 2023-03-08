package com.ahxinin.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 换货订单流程
 * @date : 2023-03-07
 */
@Slf4j
public class ExchangeOrderFlowService extends OrderAbstractService{

    @Override
    protected void selectItems() {
        log.info("select exchange item");
    }

    @Override
    protected boolean isExchangeHook() {
        return true;
    }

    @Override
    public void exchangeItems() {
        log.info("exchange item");
    }
}
