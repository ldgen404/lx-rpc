package com.ldgen.lxrpc.proxy;

import java.lang.reflect.Proxy;

/**
 * 这里使用工厂模式 简化对象的创建过程
 * 使用 Proxy.newProxyInstance 创建代理实例。
 * 参数包括：
 * 接口类的类加载器（serviceClazz.getClassLoader()）。
 * 接口类数组（new Class[]{serviceClazz}）。
 * 代理处理器 ServiceProxy 实例。
 * 返回值：将生成的代理对象强制转换为泛型类型 T 并返回。
 * 简而言之，该方法通过 JDK 动态代理机制为指定接口生成代理对象
 */

// 服务代理工厂（用于创建代理对象）
public class ServiceProxyFactory {

    public static <T> T getProxy(Class<T> serviceClazz) {
        return (T) Proxy.newProxyInstance(
                serviceClazz.getClassLoader(),
                new Class[]{serviceClazz},
                new ServiceProxy());

    }
}
