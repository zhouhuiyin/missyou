package reflect;

import java.lang.reflect.Method;
import java.util.Locale;

/**
 * 自动调用Person中名字含有s的无参方法
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for(Method method:methods){
            String methodName = method.getName();
            if(methodName.toLowerCase().contains("s")&&
            method.getParameterCount()==0){
                System.out.println("自动调用方法："+methodName +"()");
                method.invoke(o);
            }
        }
    }
}
