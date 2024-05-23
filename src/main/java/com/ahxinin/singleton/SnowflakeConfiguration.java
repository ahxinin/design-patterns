package com.ahxinin.singleton;

import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.snowflake.SnowflakeIDGenImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 单例模式-实现雪花算法
 * @date : 2024-05-23
 */
@Configuration
public class SnowflakeConfiguration {

    @Bean
    public IDGen initSnowflake(){
        long workId = 1L;
        return new SnowflakeIDGenImpl(workId);
    }
}
