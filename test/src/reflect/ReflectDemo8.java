package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

/**
 * 自动调用和当前类在同一个包中的类的方法.
 * 方法要求名字含有s且参数个数为0.
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws Exception{
        File dir = new File(
                ReflectDemo8.class.getResource(".").toURI()
        );
        System.out.println(dir.getAbsolutePath());
        //获取所有的class文件
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File file:subs){
            Class cls = Class.forName("reflect."+file.getName().substring(0,file.getName().indexOf(".")));
            Object o = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for(Method method:methods){
                String methodName = method.getName();
                if(methodName.toLowerCase().contains("s")&&method.getParameterCount()==0){
                    System.out.println("自动调用方法："+methodName+"()");
                    method.invoke(o);
                }
            }
        }
    }
}
