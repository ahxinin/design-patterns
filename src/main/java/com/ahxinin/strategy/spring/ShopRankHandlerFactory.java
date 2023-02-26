package com.ahxinin.strategy.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @description: 策略工厂
 * @date : 2023-02-01
 */
@Component
public class ShopRankHandlerFactory implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<String, ShopRankHandler> SHOP_RANK_STRATEGY_MAP;

    /**
     * 根据店铺类型获取相应的实现类
     * @param shopType 店铺类型
     * @return 店铺类型对应的实现类
     */
    public ShopRankHandler getStrategy(String shopType){
        return SHOP_RANK_STRATEGY_MAP.get(shopType);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, ShopRankHandler> beanOfType = applicationContext.getBeansOfType(ShopRankHandler.class);

        SHOP_RANK_STRATEGY_MAP = Optional.of(beanOfType)
                .map(beanOfTypeMap -> beanOfTypeMap.values().stream()
                        .filter(shopRankHandler -> StringUtils.hasLength(shopRankHandler.getType()))
                        .collect(Collectors.toMap(ShopRankHandler::getType, Function.identity())))
                .orElse(new HashMap<>(8));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
