package collection;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five","six"};
        System.out.println(Arrays.toString(array));
        List<String> list = Arrays.asList(array);//转成集合对集合操作就是对数组操作，添加元素的时候会出异常
        System.out.println(list);
//        List<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        List<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
    }
}
