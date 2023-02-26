package com.ahxinin;

import com.ahxinin.chain.ChainExecutor;
import com.ahxinin.chain.ItemRequest;
import com.ahxinin.chain.ValidResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: chain测试入口
 * @date : 2023-01-29
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ChainTest {

    @Autowired
    private ChainExecutor chainExecutor;

    @Test
    public void chainTest(){
        ItemRequest itemRequest = new ItemRequest();
        itemRequest.setName("111");
        ValidResult validResult = chainExecutor.execute(itemRequest);
        log.info("validResult:"+validResult.getMessage());
    }
}
