package com.ahxinin.decorator;

/**
 * 具体装饰角色
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    public void addBehavior(){
        System.out.println("为具体构件角色增加额外的功能");
    }
}
