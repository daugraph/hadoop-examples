package com.hadoop.ipc;

import com.hadoop.ipc.client.Client;
import com.hadoop.ipc.server.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java -jar xxx.jar (server | client)");
        }
        if ("server".equals(args[0])) {
            Server.start();
        } else {
            Client.start();
        }
    }
}
