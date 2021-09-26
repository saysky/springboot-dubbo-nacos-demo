package com.liuyanzhao.provider.service.impl;

import com.liuyanzhao.provider.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 描述
 *
 * @author: liuyanzhao
 * @date: 2021/9/26 9:42
 */
@DubboService(group = "dubbo-demo-provider", version = "1.0.0", timeout = 30000)
public class HelloServiceImpl implements HelloService
{

    @Override
    public String sayHello(String name)
    {
        return "Hello:" + name;
    }
}
