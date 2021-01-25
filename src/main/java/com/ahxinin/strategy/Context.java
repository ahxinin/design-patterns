package com.ahxinin.strategy;

/**
 * 环境类
 * @Author: hexin
 * @Date: 2021/1/22
 */
public class Context {

    private Strategy strategy;

    public void algorithm(){
        strategy.algorithm();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
