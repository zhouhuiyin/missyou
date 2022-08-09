package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("we.jpeg");
        FileOutputStream fos = new FileOutputStream("cp.jpeg");



    }
}
