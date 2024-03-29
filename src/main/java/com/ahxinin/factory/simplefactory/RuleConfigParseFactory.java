package com.ahxinin.factory.simplefactory;

import com.ahxinin.factory.domain.IRuleConfigParser;
import com.ahxinin.factory.domain.JsonRuleConfigParser;
import com.ahxinin.factory.domain.XmlRuleConfigParser;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : hexin
 * @date : 2021-10-31
 */
public class RuleConfigParseFactory {

    private static final Map<String,IRuleConfigParser> CACHED_PARSERS = new HashMap<>();

    static {
        CACHED_PARSERS.put("json", new JsonRuleConfigParser());
        CACHED_PARSERS.put("xml", new XmlRuleConfigParser());
    }

    public static IRuleConfigParser createParse(String configFormat){
        return CACHED_PARSERS.get(configFormat);
    }
}
