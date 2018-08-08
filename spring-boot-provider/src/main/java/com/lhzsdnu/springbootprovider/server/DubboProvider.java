package com.lhzsdnu.springbootprovider.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.lhzsdnu.springbootapi.IDubboProvider;

/**
 * Created by liusxg on 2018/5/10.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"

)
public class DubboProvider implements IDubboProvider {

    @Override
    public String sayHello() {
        return "connect success!!";
    }
}
