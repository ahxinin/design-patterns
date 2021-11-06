package com.ahxinin.factory;

import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

/**
 * @author : hexin
 * @description: 工厂类对象
 * @date : 2021-11-06
 */
public class RuleConfigParserFactoryMap {

    private final static Map<String,IRuleConfigParseFactory> CACHE_FACTORIES = new HashMap<>();

    static {
        CACHE_FACTORIES.put("json", new JsonRuleConfigParseFactory());
        CACHE_FACTORIES.put("xml", new XmlRuleConfigParseFactory());
    }

    public static IRuleConfigParseFactory getParserFactory(String type){
        if (StringUtils.isEmpty(type)){
            return null;
        }
        return CACHE_FACTORIES.get(type);
    }
}
