package com.ahxinin.decorator;

/**
 * 抽象装饰角色
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
