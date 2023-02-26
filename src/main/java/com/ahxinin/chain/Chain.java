package com.ahxinin.chain;

/**
 * @description: chain接口
 * @date : 2023-01-29
 */
public interface Chain {

    /**
     * 执行方法
     */
    ValidResult execute(ExecuteChain executeChain);

    /**
     * 扩展方法
     */
    ValidResult extend(ExecuteChain executeChain);

    /**
     * 执行下一个chain的execute方法
     */
    ValidResult executeNextChain(ExecuteChain executeChain);

    /**
     * chain排序
     */
    int order();

    /**
     * 服务的接口
     */
    String[] service();
}
