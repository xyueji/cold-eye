package com.xyueji.coldeye.netty;

import com.xyueji.coldeye.netty.service.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiongzhigang
 * @date 2021-01-25 16:34
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class NettyServer implements CommandLineRunner {
    private final static int NETTY_SERVER_PORT = 10010;

    public static void main(String[] args) {
        SpringApplication.run(NettyServer.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        // 1. netty辅助启动类
        ServerBootstrap bootstrap = new ServerBootstrap();
        // 2. 定义线程池
        // 线程池，用来处理接受连接请求的线程池
        NioEventLoopGroup boss = new NioEventLoopGroup();
        // 线程池，用来处理具体工作
        NioEventLoopGroup worker = new NioEventLoopGroup();
        // 3. 设置启动类属性
        bootstrap.group(boss, worker);
        bootstrap.option(ChannelOption.SO_BACKLOG, 128);
        bootstrap.childOption(ChannelOption.SO_KEEPALIVE, true);
        // 设置通道类型
        bootstrap.channel(NioServerSocketChannel.class);
        // 设置处理器
        bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new ServerHandler());
            }
        });

        try {
            // 绑定端口、启动服务
            ChannelFuture future = bootstrap.bind(NETTY_SERVER_PORT).sync();
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
