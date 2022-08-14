package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        Collection c = new HashSet();//该集合不能存放重复元素
        /**
         * 向集合中添加一个元素，成功添加后返回true
         * 注意：集合只能存放引用类型元素，存放基本类型时会自动装箱为包装类
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add("one");
        System.out.println(c);
        int size = c.size();
        System.out.println(size);
        boolean isEmpty = c.isEmpty();
        c.clear();//清空集合
    }
}
