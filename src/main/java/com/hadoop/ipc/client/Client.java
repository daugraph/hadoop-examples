package com.hadoop.ipc.client;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Client {
    public static void start() throws IOException {
        int port = 8000;
        InetSocketAddress addr = new InetSocketAddress(port);
        ClientProtocol proxy = (ClientProtocol) RPC
                .getProxy(ClientProtocol.class, ClientProtocol.versionID, addr,
                        new Configuration());
        String echo = proxy.echo("Connect succeed, please input two numbers separated by space:");
        System.out.println(echo);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String inputs = scanner.nextLine();
            String[] input = inputs.split(" ");
            int result = proxy.add(Integer.parseInt(input[0]),
                    Integer.parseInt(input[1]));
            System.out.println(result);
        }

    }
}
