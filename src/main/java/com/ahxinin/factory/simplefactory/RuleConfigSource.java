package com.ahxinin.factory.simplefactory;

import com.ahxinin.factory.domain.IRuleConfigParser;
import com.ahxinin.factory.domain.RuleConfig;

/**
 * 简单工厂模式
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParseFactory.createParse(ruleConfigFileExtension);
        if (parser == null){
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        return parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
