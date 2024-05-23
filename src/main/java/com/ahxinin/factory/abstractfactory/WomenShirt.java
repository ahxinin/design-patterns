package com.ahxinin.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 具体产品类，women shirt
 * @date : 2024-05-23
 */
@Slf4j
public class WomenShirt extends Shirt{

    @Override
    public void Show() {
        log.info("women shirt");
    }
}
