package com.ahxinin.chain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Kane
 * @description: chain适配器
 * @date : 2023-01-29
 */
@Component
public class ChainsAdapter {

    @Autowired
    ChainContext chainContext;

    public List<Chain> adapt(String service){
        return chainContext.get(service);
    }
}
