package com.kreitek.utils;

import com.kreitek.entity.Directory;
import com.kreitek.entity.error.ListEmpty;
import com.kreitek.files.FileSystemItem;
import com.kreitek.service.FileManager;

import java.util.List;

public class FileSystemPrinter {

    private final FileManager fileManager;

    public FileSystemPrinter() {
        this.fileManager = new FileManager();
    }

    public static void print(FileSystemItem item, int nivel) {
        String indentation = "\t".repeat(nivel);
        String message = String.format("%s%s = %d bytes", indentation, item.getFullPath(), FileManager.calculateSize(item));
        System.out.println(message);

        if (item instanceof Directory) {
            for (FileSystemItem subitem: ((Directory)item).listFiles()) {
                FileSystemPrinter.print(subitem, nivel + 1);
            }
        }
    }

    public static void printDirectorySize(FileSystemItem item){
        try {
            List<FileSystemItem> files = ((Directory)item).listFiles();
            String message = String.format("%s = %d bytes",item.getFullPath(), FileManager.calculateSize(files));
            System.out.println(message);
        }catch (Exception e){
            throw new ListEmpty("Lista vacia");
        }

    }
}
