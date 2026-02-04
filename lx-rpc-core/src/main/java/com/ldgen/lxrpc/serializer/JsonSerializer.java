package com.ldgen.lxrpc.serializer;


import java.io.IOException;

/**
 * Json 序列化器
 */
public class JsonSerializer implements Serializer {

    @Override
    public <T> byte[] serialize(T object) throws IOException {

        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> type) throws IOException {
        return null;
    }
}
