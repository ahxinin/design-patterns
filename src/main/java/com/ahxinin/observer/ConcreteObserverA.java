package com.ahxinin.observer;

/**
 * 具体观察者A
 * @Author: hexin
 * @Date: 2021/1/20
 */
public class ConcreteObserverA implements Observer{

    @Override
    public void process() {
        System.out.println("具体观察者A处理");
    }
}
