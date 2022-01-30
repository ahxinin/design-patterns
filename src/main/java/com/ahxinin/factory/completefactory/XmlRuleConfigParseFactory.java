package com.ahxinin.factory.completefactory;

import com.ahxinin.factory.domain.IRuleConfigParser;
import com.ahxinin.factory.domain.XmlRuleConfigParser;

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
