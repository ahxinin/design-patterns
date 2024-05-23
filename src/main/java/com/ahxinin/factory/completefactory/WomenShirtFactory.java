package com.ahxinin.factory.completefactory;

/**
 * @description: 创建具体工厂类，继承抽象工厂类，实现具体产品的创建
 * @date : 2024-05-23
 */
public class WomenShirtFactory extends Factory{

    @Override
    public Shirt exhibit() {
        return new WomenShirt();
    }
}
