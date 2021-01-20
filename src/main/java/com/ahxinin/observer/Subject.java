package com.ahxinin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 * @Author: hexin
 * @Date: 2021/1/20
 */
public abstract class Subject {

    //增加观察者
    public abstract void add(Observer observer);

    //移除观察者
    public abstract void remove(Observer observer);

    //通知观察者方法
    public abstract void notifys();
}
