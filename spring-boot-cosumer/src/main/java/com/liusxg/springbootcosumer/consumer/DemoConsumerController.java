package com.liusxg.springbootcosumer.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lhzsdnu.springbootapi.IDubboProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}")
    private IDubboProvider dubboProvider;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return dubboProvider.sayHello();
    }

}
