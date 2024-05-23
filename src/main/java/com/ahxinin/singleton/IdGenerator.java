package com.ahxinin.singleton;

/**
 * 单例模式
 */
public class IdGenerator {

    private static IdGenerator instance;

    private IdGenerator() {};

    public static IdGenerator getInstance(){
        if(instance == null){
            synchronized(IdGenerator.class){
                if(instance == null){
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }
}
