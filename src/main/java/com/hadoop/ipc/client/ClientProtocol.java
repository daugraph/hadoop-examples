package com.hadoop.ipc.client;

import org.apache.hadoop.ipc.VersionedProtocol;

import java.io.IOException;

public interface ClientProtocol extends VersionedProtocol {
    public static final long versionID=  1L;
    String echo(String value) throws IOException;
    int add(int v1, int v2) throws IOException;
}
