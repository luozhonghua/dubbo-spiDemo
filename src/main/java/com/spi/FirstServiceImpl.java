package com.spi;

/**
 * Created by luozhonghua on 2018/5/25.
 */
public class FirstServiceImpl implements DemoService {


    @Override
    public void sayHello() {
        System.out.println("FirstService");
    }
}
