package reflect;

import java.lang.reflect.Method;

/**
 * 自动调用Person中被@AutoRun标注的方法指定次
 */
public class ReflectDemo11 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(AutoRun.class)){
                //获取该方法上的@AutoRun注解
                AutoRun ar =method.getAnnotation(AutoRun.class);
                //通过AutoRun注解获取参数value
                int value = ar.value();
                System.out.println("自动执行"+method.getName()+value+"遍");
                for(int i=1;i<=value;i++){
                    System.out.println("执行第"+i+"次;");
                    method.invoke(o);
                }
            }
        }
    }
}
