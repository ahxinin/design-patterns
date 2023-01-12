package com.ahxinin.builder;

/**
 * @author : hexin
 * @description: 建造者模式
 * @date : 2021-11-06
 */
public class ConstructorArg {

    private boolean isRef;

    private Class type;

    private Object arg;

    public ConstructorArg(Builder builder){
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    //当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；当 isRef 为 false 的时候，arg、type 都需要设置。

    public static class Builder{

        private boolean isRef;

        private Class type;

        private Object arg;

        public ConstructorArg build(){
            if (!isRef){
                type = ConstructorArg.class;
            }
            return null;
        }
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Object getArg() {
        return arg;
    }

    public void setArg(Object arg) {
        this.arg = arg;
    }
}
