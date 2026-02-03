package com.ldgen.lxrpc.serializer;

import java.io.IOException;

/**
 * 序列化器接口
 * 什么是序列化
 * 序列化是将Java对象转换为字可传输得字节数组，而反序列化是将字节数组转换为Java对象。
 * 序列化的作用
 * 1. 网络传输
 * 2. 持久化存储
 * 3. 对象缓存
 * 使用原生Java序列化器
 */
public interface Serializer {

    /**
     * 序列化
     *
     * @param object
     * @param <T>
     * @return
     * @throws IOException
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 反序列化
     *
     * @param bytes
     * @param type
     * @param <T>
     * @return
     * @throws IOException
     */
    <T> T deserialize(byte[] bytes, Class<T> type) throws IOException;

}
