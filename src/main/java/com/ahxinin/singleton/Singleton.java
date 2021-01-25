package com.ahxinin.singleton;

/**
 * 单例
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
