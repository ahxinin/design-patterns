package com.ahxinin.factory;

import com.ahxinin.factory.simplefactory.Factory;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

/**
 * @description: 简单工厂模式测试类
 * @date : 2024-05-23
 */
@Slf4j
public class SimpleFactoryPatternTest {

    /**
     * 调用工厂方法，根据不同的参数创建不同的产品类实例
     */
    public static void main(String[] args) throws IOException {
        Factory factory = new Factory();
        //men shirt
        factory.exhibit("men").Show();
        //women shirt
        factory.exhibit("women").Show();
    }
}