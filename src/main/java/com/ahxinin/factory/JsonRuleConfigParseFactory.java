package com.ahxinin.factory;

import com.ahxinin.domain.IRuleConfigParser;
import com.ahxinin.domain.JsonRuleConfigParser;

/**
 * @author : hexin
 * @description: json工厂
 * @date : 2021-11-06
 */
public class JsonRuleConfigParseFactory implements IRuleConfigParseFactory{

    @Override
    public IRuleConfigParser createParse() {
        return new JsonRuleConfigParser();
    }
}
