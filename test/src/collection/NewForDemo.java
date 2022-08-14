package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5推出时推出了一个新特性：增强型for循环
 * 也称为新循环，可以用相同的语法遍历集合或数组。
 * 注意：新循环仅用来遍历集合或数组，不取代传统循环的工作，
 * 语法：
 * for(元素类型 变量名 ：集合或数组)
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for(String str : array){
            System.out.println(str);
        }
//        for(Object o : c){
//            String str = (String)o;
//            System.out.println(str);
//
//        }
        for(String str : c){
            System.out.println(str);
        }
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String str = it.next();
            //it.remove();
        }
    }
}
