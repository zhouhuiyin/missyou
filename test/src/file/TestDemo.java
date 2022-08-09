package file;

import java.io.File;
import java.io.FileFilter;

public class TestDemo {
    public static void main(String[] args) {
        File file = new File(".");
        if(file.isDirectory()){
            FileFilter filter = pathname -> pathname.getName().contains("m");
            File[] sub = file.listFiles(filter);
            for(int i=0;i<sub.length;i++){
                System.out.println(sub[i].getName());
            }

        }
    }
}
