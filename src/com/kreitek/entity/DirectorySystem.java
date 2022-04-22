package com.kreitek.entity;

import com.kreitek.files.FileSystemItem;

import java.util.List;

public interface DirectorySystem {
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
}
