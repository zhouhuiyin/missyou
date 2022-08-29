package reflect;

import java.lang.reflect.Method;

public class ReflectDemo10 {
    public static void main(String[] args)throws Exception {
        //获取Person类中被@AutoRun标注的方法
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            //判断该方法是否被@AutoRun注解了
            if(method.isAnnotationPresent(AutoRun.class)){
                System.out.println(method.getName()+"被@AutoRun标注了");
            }else{
                System.out.println(method.getName()+"没有被@AutoRun标注了");
            }
        }
    }

}
