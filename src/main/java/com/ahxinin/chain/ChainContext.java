package com.ahxinin.chain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: chain上下文加载
 * @date : 2023-01-29
 */
@Component
public class ChainContext implements BeanPostProcessor {

    private Map<String, List<Chain>> maps = new HashMap<>();

    public List<Chain> get(String service){
        return maps.get(service);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (!(bean instanceof Chain)){
            return bean;
        }

        Chain chain = (Chain) bean;
        for (String service : chain.service()){
            List<Chain> chains = maps.containsKey(service) ? maps.get(service) : new ArrayList<>();
            chains.add(chain);
            chains.sort(Comparator.comparingInt(Chain::order));
            maps.put(service, chains);
        }

        return bean;
    }
}
