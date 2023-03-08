package com.ahxinin.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 退货订单流程
 * @date : 2023-03-07
 */
@Slf4j
public class ReturnOrderFlowService extends OrderAbstractService{

    @Override
    protected void selectItems() {
        log.info("select return items");
    }

    @Override
    protected boolean isReturnHook() {
        return true;
    }

    @Override
    public void returnItems() {
        log.info("return items");
    }
}
