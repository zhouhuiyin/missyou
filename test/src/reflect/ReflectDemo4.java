package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 利用反射机制调方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.sayHello();

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method method = cls.getMethod("sayHello");
        method.invoke(o);//p.sayHello
    }
}
