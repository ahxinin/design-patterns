package com.ahxinin.factory.completefactory;

import com.ahxinin.factory.domain.IRuleConfigParser;

/**
 * @author : hexin
 * @description: 抽象工厂
 * @date : 2021-11-06
 */
public interface IRuleConfigParseFactory {

    IRuleConfigParser createParse();
}
