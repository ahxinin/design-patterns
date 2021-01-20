package com.ahxinin.observer;

/**
 * 具体观察者B
 * @Author: hexin
 * @Date: 2021/1/20
 */
public class ConcreteObserverB implements Observer{

    @Override
    public void process() {
        System.out.println("具体观察者B处理");
    }
}
