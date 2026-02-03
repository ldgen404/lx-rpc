package com.ldgen.example.provider;

import com.ldgen.example.common.service.UserService;
import com.ldgen.lxrpc.registry.LocalRegistry;
import com.ldgen.lxrpc.server.HttpServer;
import com.ldgen.lxrpc.server.VertxHttpServer;

/**
 * 建议服务提供者示例
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        //注册服务- 提供服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}