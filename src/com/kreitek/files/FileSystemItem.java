package com.kreitek.files;

import com.kreitek.entity.Directory;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    Directory getParent();
    void setParent(Directory directory);
    String getFullPath();
    int getSize();
}
