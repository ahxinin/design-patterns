package com.ahxinin.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 具体产品类，women trousers
 * @date : 2024-05-23
 */
@Slf4j
public class WomenTrousers extends Trousers{

    @Override
    public void Show() {
        log.info("women trousers");
    }
}
