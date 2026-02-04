package com.ldgen.example.consumer;

import com.ldgen.example.common.model.User;
import com.ldgen.example.common.service.UserService;
import com.ldgen.lxrpc.proxy.ServiceProxyFactory;

/**
 * 简单服务消费者示例
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        //todo:需要获取UserService得实现类对象
        //静态代理
        //UserServiceProxy userService = new UserServiceProxy();
//        UserService userService = null;
        User user = new User();
        user.setName("ldgen");
        //调用 - 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println("用户名：" + newUser.getName());
        } else {
            System.out.println("用户名不存在");
        }
    }
}
