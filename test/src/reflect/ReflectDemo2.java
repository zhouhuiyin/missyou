package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);


        //加载类对象
//        Class cls = Class.forName("reflect.Person");
        /*
        java.util.ArrayList
        java.util.HashMap
        java.util.Date
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String name = scanner.nextLine();
        Class cls = Class.forName(name);
        //实例化
        /**
         * Class提供的newInstance()方法要求Class表示的类必须提供了无参构造器
         */
        Object o = cls.newInstance();
        System.out.println(o);


    }

}
