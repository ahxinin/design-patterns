package com.ahxinin;

import com.sankuai.inf.leaf.IDGen;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: 单例模式测试类
 * @date : 2024-05-23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SingletonPatternTest {

    @Resource
    private IDGen idGen;

    @Test
    public void createIdTest(){
        long id = idGen.get("design-patterns").getId();
        log.info("id:{}",id);
    }
}
