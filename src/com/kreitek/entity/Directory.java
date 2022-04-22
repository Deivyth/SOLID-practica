package com.kreitek.entity;

import com.kreitek.files.FileSystemItem;
import com.kreitek.files.FileSystemItemBase;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements DirectorySystem{

    private final List<FileSystemItem> files;
    private int size = 0;

    public Directory(Directory parent, String name) {
        super(parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    @Override
    public List<FileSystemItem> listFiles() {
        return files;
    }

    @Override
    public void addFile(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }

    @Override
    public void removeFile(FileSystemItem file) {
        files.remove(file);
    }

    @Override
    public int getSize() {
        return size;
    }

}
