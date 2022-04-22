package com.kreitek.entity;

public interface FileSystem {
    String getExtension();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
