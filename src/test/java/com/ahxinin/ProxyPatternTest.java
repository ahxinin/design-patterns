package com.ahxinin;

import com.ahxinin.proxy.Proxy;

/**
 * 代理模式测试类
 * @Author: hexin
 * @Date: 2024/5/23
 */
public class ProxyPatternTest {

    public static void main(String[] args){
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
