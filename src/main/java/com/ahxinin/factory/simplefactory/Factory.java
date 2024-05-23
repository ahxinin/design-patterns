package com.ahxinin.factory.simplefactory;

/**
 * @description: 工厂类
 * @date : 2024-05-23
 */
public class Factory {

    /**
     * 通过shirtName来创建不同的产品
     */
    public Shirt exhibit(String shirtName){
        switch (shirtName){
            case "men":
                return new MenShirt();
            case "women":
                return new WomenShirt();
            default:
                return null;
        }
    }
}
