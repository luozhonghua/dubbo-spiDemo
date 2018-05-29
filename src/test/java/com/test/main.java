package com.test;

import com.parser.PeopleBeanDefinitionParser;
import com.pojo.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by luozhonghua on 2018/5/29.
 */
public class main {


    public  static  void main(String []args){

        ClassPathXmlApplicationContext providerContext = new ClassPathXmlApplicationContext(main.class.getPackage().getName().replace('.', '/') +"/beans.xml");
        try {
            People people = (People) providerContext.getBean("p");
            System.out.println(people.getName());
            System.out.println(people.getAge());
           // assertEquals(20812, dubbo.getPort().intValue());
        } finally {
//            System.setProperty("dubbo.protocol.port", "");
//            providerContext.stop();
//            providerContext.close();
        }

    }
}
