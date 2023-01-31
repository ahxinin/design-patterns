package com.ahxinin.chain;

/**
 * @author : Kane
 * @description: 执行链接口
 * @date : 2023-01-29
 */
public interface ExecuteChain {

    /**
     * 是否开启校验
     */
    boolean enable();

    /**
     * 服务于校验链的绑定关系
     */
    String service();
}
