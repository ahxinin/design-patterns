package com.ahxinin.template;

/**
 * @author : hexin
 * @description: 父类
 * @date : 2022-01-30
 */
public abstract class AbstractClass {

    public final void templateMethod(){
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
}
