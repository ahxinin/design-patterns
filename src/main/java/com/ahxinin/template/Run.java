package com.ahxinin.template;

/**
 * @author : hexin
 * @description: 执行入口
 * @date : 2022-01-30
 */
public class Run {

    public void test(){
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();
    }
}
