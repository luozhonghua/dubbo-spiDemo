package com.rpc.service;

/**
 * Created by luozhonghua on 2018/5/30.
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name;
    }
}
