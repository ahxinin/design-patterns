package com.ahxinin.chain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * @author : Kane
 * @description: chain执行器
 * @date : 2023-01-29
 */
@Component
public class ChainExecutor {

    @Autowired
    ChainsAdapter chainsAdapter;

    public ValidResult execute(ExecuteChain request){
        if (!request.enable()){
            return ValidResult.ok();
        }

        List<Chain> chains = chainsAdapter.adapt(request.service());
        if (CollectionUtils.isEmpty(chains)){
            return ValidResult.ok();
        }

        for (Chain chain : chains){
            ValidResult validResult = chain.execute(request);
            if (!validResult.isSuccess()){
                return validResult;
            }
        }
        return ValidResult.ok();
    }
}
