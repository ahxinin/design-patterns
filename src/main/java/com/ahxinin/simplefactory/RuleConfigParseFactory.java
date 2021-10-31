package com.ahxinin.simplefactory;

import com.ahxinin.domain.IRuleConfigParser;
import com.ahxinin.domain.JsonRuleConfigParser;
import com.ahxinin.domain.XmlRuleConfigParser;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : hexin
 * @date : 2021-10-31
 */
public class RuleConfigParseFactory {

    private static final Map<String,IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
    }

    public static IRuleConfigParser createParse(String configFormat){
        return cachedParsers.get(configFormat);
    }
}
