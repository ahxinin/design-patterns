package com.ahxinin.factory;

import com.ahxinin.domain.IRuleConfigParser;
import com.ahxinin.domain.JsonRuleConfigParser;
import com.ahxinin.domain.XmlRuleConfigParser;

/**
 * @author : hexin
 * @description: xml工厂
 * @date : 2021-11-06
 */
public class XmlRuleConfigParseFactory implements IRuleConfigParseFactory{

    @Override
    public IRuleConfigParser createParse() {
        return new XmlRuleConfigParser();
    }
}
