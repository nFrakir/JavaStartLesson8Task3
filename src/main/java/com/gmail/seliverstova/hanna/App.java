package com.gmail.seliverstova.hanna;

import java.io.File;

public class App {
    public static void main(String[] args) {
        File file = new File (".");
        printDirectories(file);
    }

    public static void printDirectories(File file) {
        File[] files = file.listFiles();
        for (File element: files) {
            if (!element.isFile()) {
                System.out.println(element);
            }
        }
    }
}
