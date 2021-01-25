package com.ahxinin.observer;

/**
 * @Author: hexin
 * @Date: 2021/1/20
 */
public class ObserverPattern {

    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        subject.add(observerA);
        subject.add(observerB);
        subject.notifys();
    }
}
