package com.ahxinin.singleton;

/**
 * 单例模式
 * @Author: hexin
 * @Date: 2021/1/25
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton(){
    }

    /**
     * 双重校验锁
     */
    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
