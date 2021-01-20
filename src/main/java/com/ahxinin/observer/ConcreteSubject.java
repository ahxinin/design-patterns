package com.ahxinin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hexin
 * @Date: 2021/1/20
 */
public class ConcreteSubject extends Subject{

    private Integer state;

    private List<Observer> observers;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    public void setState(Integer state){
        this.state = state;
        //状态改变通知观察者
        notifys();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifys() {
        System.out.println("具体目标状态发生改变");
        for (Observer observer: observers){
            observer.process();
        }
    }
}
