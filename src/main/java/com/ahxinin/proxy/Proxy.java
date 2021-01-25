package com.ahxinin.proxy;

/**
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        afterRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理");
    }

    public void afterRequest(){
        System.out.println("访问真实主题之后的后续处理");
    }
}
