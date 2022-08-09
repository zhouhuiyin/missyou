package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./test.txt");
        fos.write(1);
        fos.close();

    }
}
