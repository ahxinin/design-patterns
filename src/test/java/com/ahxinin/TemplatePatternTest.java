package com.ahxinin;

import com.ahxinin.template.ExchangeOrderFlowService;
import com.ahxinin.template.ReturnOrderFlowService;

/**
 * @description: 模式方法模式测试类
 * @date : 2024-05-23
 */
public class TemplatePatternTest {

    public static void main(String[] args){
        ExchangeOrderFlowService exchangeOrderFlowService = new ExchangeOrderFlowService();
        exchangeOrderFlowService.orderFlow();

        ReturnOrderFlowService returnOrderFlowService = new ReturnOrderFlowService();
        returnOrderFlowService.orderFlow();
    }
}
