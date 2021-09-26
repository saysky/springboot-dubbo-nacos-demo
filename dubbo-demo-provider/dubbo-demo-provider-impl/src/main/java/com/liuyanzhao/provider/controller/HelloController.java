package com.liuyanzhao.provider.controller;

import com.liuyanzhao.provider.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author: liuyanzhao
 * @date: 2021/9/26 9:43
 */
@RestController
public class HelloController
{
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String index() {
        return helloService.sayHello("provider");
    }
}
