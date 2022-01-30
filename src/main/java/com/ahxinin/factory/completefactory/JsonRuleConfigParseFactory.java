package com.ahxinin.factory.completefactory;

import com.ahxinin.factory.domain.IRuleConfigParser;
import com.ahxinin.factory.domain.JsonRuleConfigParser;

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
