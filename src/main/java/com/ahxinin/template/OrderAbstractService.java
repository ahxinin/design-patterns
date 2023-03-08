package com.ahxinin.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 抽象父类
 * @date : 2023-03-07
 */
@Slf4j
public abstract class OrderAbstractService {

    public final void orderFlow(){
        selectItems();
        checkoutItems();

        if (isReturnHook()){
            returnItems();
        }else if (isExchangeHook()){
            exchangeItems();
            confirmReceipt();
        }else {
            confirmReceipt();
        }

        terminateTransaction();
    }

    protected abstract void selectItems();

    protected void checkoutItems(){
        log.info("checkout item");
    }

    protected boolean isReturnHook(){
        return false;
    }

    protected boolean isExchangeHook(){
        return false;
    }

    protected void confirmReceipt(){
        log.info("confirmReceipt");
    }

    protected void terminateTransaction(){
        log.info("terminateTransaction");
    }

    public void returnItems(){

    }

    public void exchangeItems(){

    }
}
