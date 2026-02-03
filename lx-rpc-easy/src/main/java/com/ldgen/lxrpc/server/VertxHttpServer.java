package com.ldgen.lxrpc.server;

import io.vertx.core.Vertx;

/**
 * 基于 Vert.x 的 HTTP 服务器实现
 */
public class VertxHttpServer implements HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    @Override
    public void doStart(int port) {
        Vertx vertx = Vertx.vertx();

        //创建 HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        //监听端口并处理请求
        server.requestHandler(request -> {
            //处理http请求
            System.out.println("Received request" + request.method() + "" + request.uri());

            //发送HTTP响应
            request.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello From Vert,x Http server!");
        });

        //启动HTTP服务器并且监听制定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("Server is new listening no port " + port);
            } else {
                System.out.println("Failed to start server" + result.cause());
            }
        });

    }
}
