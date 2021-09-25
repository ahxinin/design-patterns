package com.ahxinin.simplefactory;

/**
 * @Author: hexin
 * @Date: 2021/3/17
 */
public class SimpleFactory {

    public Product createProduct(String type){
        if (type.equals("A")){
            return new ProductA();
        } else  if (type.equals("B")){
            return new ProductB();
        }
        return null;
    }
}
