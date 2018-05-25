package com.spi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * Created by luozhonghua on 2018/5/25.
 */
public class mains {

    public static void main(String[]args){

        ServiceLoader<DemoService> spiLoader = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> iteratorSpi=spiLoader.iterator();
        while (iteratorSpi.hasNext()){
            DemoService demoService=iteratorSpi.next();
            demoService.sayHello();
        }

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");


        map.put("1", "3");
        System.out.println(map.get("1"));

        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));

    }

}
