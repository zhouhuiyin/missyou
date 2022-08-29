package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
    java反射机制
    反射是java的动态机制，允许我们在程序运行期间确定对象的实例化操作，方法的调用和属性的操作等

    反射可以提高代码的灵活度，但是会有更多的系统开销和较慢的运行效率
*
* */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            反射的第一步:获取要操作的类的类对象
            class类
            class类称为类的类对象.JVM在加载一个类时会实例化一个class实例
            与之对应，每个类都有且只要一个class的实例。
            通过这个class实例中的提供的一系列方法我们可以在程序
            运行期间了解其表示的类的一切信息(类名,有哪些方法,构造器,属性等)
            以便进行操作.
            获取一个类的类对象的方式如下:
            1:类名.class
            如:
                Class cls = String.class;//获取String的类对象
                Class cls = int.class;//获取int的类对象
                注:基本类型只有这种方式可以获取类对象

            2:Class.forName(String  className)
            如:
                Class cls = Class.forName("java.lang.String");

            3:类加载器ClassLoader获取
        * */

        //获取String的类对象
//      Class cls = String.class;


        //自主输入获取类对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名");
        String name = scanner.next();
        Class cls = Class.forName(name);

        //获取类名,完全限定名(格式:包名.类名)
        String className = cls.getName();
        System.out.println(className);
        //仅获取类名
        className = cls.getSimpleName();
        System.out.println(className);

        //获取所有方法
        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
            //获取该方法的返回值类型
            Class returnCls = method.getReturnType();
            System.out.println("该方法的返回值类型为:"+returnCls.getName());
            //获取该方法的参数个数
            int count = method.getParameterCount();
            System.out.println("该方法有" +count+ "个参数");
        }
    }
}
