package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int d = fis.read();
        System.out.println(d);
        fis.close();
    }
}
