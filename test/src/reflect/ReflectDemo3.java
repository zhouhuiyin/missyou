package reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射机制操作构造器实例化对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");
        //相当于Person(){}
        Constructor c = cls.getConstructor();//获取无参构造器
        Object o  = c.newInstance();
        System.out.println(o);

        Person p2 = new Person("李四",28);
        System.out.println(p2);

        Constructor c2 = cls.getConstructor(String.class,int.class);
        Object o2 = c2.newInstance("李四",30);
        System.out.println(o2);
    }
}
