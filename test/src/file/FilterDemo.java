package file;

import java.io.File;
import java.io.FileFilter;

public class FilterDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    String fileName = file.getName();
                    System.out.println("正在过滤文件"+fileName);
                    return fileName.startsWith(".");
                }
            };
            File[] subs = dir.listFiles(filter);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }

}
