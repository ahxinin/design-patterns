package com.ahxinin.proxy;

/**
 * 真实主题
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("访问真实的主题");
    }
}
