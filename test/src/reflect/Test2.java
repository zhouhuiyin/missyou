package reflect;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 自动调用与Test2在同一个包中被@AutoRunClass标注的类中被@AutoRun标注的方法
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                Test.class.getResource(".").toURI()
        );
        File[] files = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File file:files ){
            String fileName = file.getName().substring(0,file.getName().indexOf("."));
            Class cls = Class.forName("reflect."+fileName);
            if(!cls.isAnnotation()&&
            cls.isAnnotationPresent(AutoRunClass.class)){
                Object o = cls.newInstance();
                Method[] methods = cls.getDeclaredMethods();
                for(Method method:methods){
                    if(method.isAnnotationPresent(AutoRun.class)){
                        method.invoke(o);
                    }
                }
            }
        }


    }
}
