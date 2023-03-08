package com.ahxinin.template;

/**
 * @description: 测试类
 * @date : 2023-03-07
 */
public class OrderFlowTest {

    public static void main(String[] args){
        ExchangeOrderFlowService exchangeOrderFlowService = new ExchangeOrderFlowService();
        exchangeOrderFlowService.orderFlow();

        ReturnOrderFlowService returnOrderFlowService = new ReturnOrderFlowService();
        returnOrderFlowService.orderFlow();
    }
}
