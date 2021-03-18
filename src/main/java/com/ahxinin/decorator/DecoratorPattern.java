package com.ahxinin.decorator;

/**
 * 装饰模式
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class DecoratorPattern {

    public static void main(String[] args){
        Component component = new ConcreteComponent();
        component.operation();

        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
