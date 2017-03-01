package com.lenzhao.bootstrap;

import com.lenzhao.framework.server.RpcServerBootstrap;

/**
 * Created by lenzhao on 17-3-1.
 */
public class Main {
    public static void main(String[] args) {
        RpcServerBootstrap bootstrap = new RpcServerBootstrap();
        int port = 10881;
        if (null != args && args.length > 0) {
            port = Integer.valueOf(args[0]);
        }
        bootstrap.start(port);
    }
}
