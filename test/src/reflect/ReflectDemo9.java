package reflect;


import java.io.File;
import java.lang.reflect.Method;

/**
 * 自动调用当前类所在包下所有类的main方法
 */
public class ReflectDemo9 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                ReflectDemo9.class.getResource(".").toURI()
        );
        System.out.println(dir.getAbsolutePath());
        //获取所有的class文件
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File file : subs) {
            Class cls = Class.forName("reflect." + file.getName().substring(0, file.getName().indexOf(".")));
            //获取main方法
            try {
                Method m = cls.getMethod("main", String[].class);
                System.out.println("执行" + file.getName() + "的main方法");
                //调用静态方法时，第一个参数（方法所属对象）传入null
                /*
                main方法的参数是一个string数组，但是直接传入string数组时它会和invoke第二
                个参数（变长参数定义）冲突，使得invoke不认为传入的string数组是main的唯一实参。
                因此将其强转成object，使得认定为一个实参.
                 */
                m.invoke(null, (Object) new String[]{});
            }catch (NoSuchMethodException e){

            }
        }
    }
}