package com.rpc.consumer;

import com.rpc.RpcFramework;
import com.rpc.service.HelloService;

/**
 * 引用服务
 * Created by luozhonghua on 2018/5/30.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.hello("World" + i);
            System.out.println(hello);
            Thread.sleep(1000);

        }
    }
}
