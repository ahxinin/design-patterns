package com.ahxinin.decorator;

/**
 * 具体构件角色
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent(){
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法");
    }
}
