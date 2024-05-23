package com.ahxinin.factory.abstractfactory;

/**
 * @description: 具体工厂类型，定义创建具体产品实例方法，男装工厂类
 * @date : 2024-05-23
 */
public class MenFactory extends Factory{

    @Override
    public Clothing exhibitShirt() {
        return new MenShirt();
    }

    @Override
    public Clothing exhibitTrousers() {
        return new MenTrousers();
    }
}
