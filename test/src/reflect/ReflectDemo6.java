package reflect;


import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
//        p.hehe(); 类的外部能访问私有方法

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
//        Method m = cls.getMethod("hehe");
        Method m1 = cls.getDeclaredMethod("hehe");
        m1.setAccessible(true);
        m1.invoke(o);
    }
}
