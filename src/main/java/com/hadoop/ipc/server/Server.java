package com.hadoop.ipc.server;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class Server {
    public static void start() throws IOException {
        RPC.Server server = new RPC.Server(new ClientProtocolImpl(),
                new Configuration(), "0.0.0.0", 8000);
        server.start();
    }
}
