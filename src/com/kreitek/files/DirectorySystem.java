package com.kreitek.files;

import java.util.List;

public interface DirectorySystem {
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
}