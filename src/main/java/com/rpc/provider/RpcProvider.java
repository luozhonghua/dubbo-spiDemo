package com.rpc.provider;

import com.rpc.RpcFramework;
import com.rpc.service.HelloService;
import com.rpc.service.HelloServiceImpl;

/**
 * 暴露服务
 * Created by luozhonghua on 2018/5/30.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }
}
