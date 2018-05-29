package com.parser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by luozhonghua on 2018/5/29.
 */
public class MyNamespaceHandler extends
        NamespaceHandlerSupport {
    @Override
    public void init() {
        //先注册bean工厂
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());//people是一个element

    }
}
