package com.hadoop.ipc.server;

import com.hadoop.ipc.client.ClientProtocol;

import java.io.IOException;

public class ClientProtocolImpl implements ClientProtocol {
    @Override
    public String echo(String value) throws IOException {
        return value;
    }

    @Override
    public int add(int v1, int v2) throws IOException {
        return v1 + v2;
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return ClientProtocol.versionID;
    }
}
