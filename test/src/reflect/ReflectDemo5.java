package reflect;


import java.lang.reflect.Method;

/*
调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method m1 = cls.getMethod("say", String.class);
        m1.invoke(o,"哈哈");

    }
}
