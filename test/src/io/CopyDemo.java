package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("we.jpeg");
        FileOutputStream fos = new FileOutputStream("cp.jpeg");
        int d;
        long start = System.currentTimeMillis();
        while ((d = fis.read()) != -1){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕");
        System.out.println(end-start);
        fis.close();
        fos.close();
    }
}
