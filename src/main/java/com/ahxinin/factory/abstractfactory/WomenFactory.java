package com.ahxinin.factory.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: 女装工厂类
 * @date : 2024-05-23
 */
@Slf4j
public class WomenFactory extends Factory{

    @Override
    public Clothing exhibitShirt() {
        return new WomenShirt();
    }

    @Override
    public Clothing exhibitTrousers() {
        return new WomenTrousers();
    }
}
