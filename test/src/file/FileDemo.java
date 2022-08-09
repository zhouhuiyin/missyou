package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        if(file.exists()){
            System.out.println("文件已经存在");
        }else {
            file.createNewFile();
        }

    }
}
