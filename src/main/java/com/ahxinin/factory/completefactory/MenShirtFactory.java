package com.ahxinin.factory.completefactory;


/**
 * @description: 创建具体工厂类
 * @date : 2024-05-23
 */
public class MenShirtFactory extends Factory{

    @Override
    public Shirt exhibit() {
        return new MenShirt();
    }
}
