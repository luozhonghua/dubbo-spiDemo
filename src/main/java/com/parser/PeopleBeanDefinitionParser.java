package com.parser;

import com.pojo.People;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * Created by luozhonghua on 2018/5/29.
 */
public class PeopleBeanDefinitionParser extends
        AbstractSingleBeanDefinitionParser {


    protected Class getBeanClass(Element element) {

        return People.class;
    }


    /**
     * 获取xsd属性
     *
     * @param element people.xsd
     * @param bean    people.class包装类
     */
    protected void doParse(Element element, BeanDefinitionBuilder bean) {


        String name = element.getAttribute("name");
        String age = element.getAttribute("age");

        if (StringUtils.hasText(name)) {
            bean.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            bean.addPropertyValue("age",
                    Integer.valueOf(age));
        }
    }

}
