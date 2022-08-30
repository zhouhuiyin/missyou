package reflect;

import java.io.File;
import java.lang.reflect.Method;
/*
    自动调用与当前类Test在同一目录下的被@AutoRun标注的方法
* */
public class Test {
    public static void main(String[] args) throws Exception {
        File dir = new File(Test.class.getResource(".").toURI());
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File file : subs){
            String className = file.getName().substring(
                    0,file.getName().indexOf(".")
            );
            Class cls = Class.forName("reflect."+className);
            //查看当前Class表示的是否为一个注解
            if(!cls.isAnnotation()){
                Object o = cls.newInstance();
                System.out.println("实例化:"+cls.getName());
                Method[] methods = cls.getDeclaredMethods();
                for(Method method : methods){
                    if(method.isAnnotationPresent(AutoRun.class)){
                        System.out.println("启动调用方法:"+method.getName());
                        method.invoke(o);
                    }
                }
            }
        }
    }
}
