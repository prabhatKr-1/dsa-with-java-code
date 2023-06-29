package com.DSA.BinaryTrees;

import java.io.FileInputStream;
import java.io.*;

public class practice {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Java\\LearnJava\\src\\com\\DSA\\BinaryTrees\\note.txt");
        int data;
        int ite = fis.available();
        for (int i = 0; i < ite; i++) {
            data = fis.read();
            System.out.print((char) data);
        }
        fis.close();
    }
}
