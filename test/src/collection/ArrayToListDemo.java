package collection;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 数组转集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five","six"};
//        System.out.println(Arrays.toString(array));
        List<String> list = Arrays.asList(array);//转成集合对集合操作就是对数组操作，添加元素的时候会出异常
        System.out.println(list);
//        String first=list.set(0,list.get(list.size()-1));
//        list.set(list.size()-1,first);
//        System.out.println(list);
        for(int i = 0;i<list.size()/2;i++){
            String s = list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,s);
        }
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
//        List<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        List<String> list1 = new ArrayList<>(list);
//        System.out.println(list1);
        list1.remove(2);
//        System.out.println(list1);
        List<String> list2 = new LinkedList<>();
        list2.add("草草");
//        System.out.println(list2);
        List<String> list5 = new ArrayList<>();
        list5.add("first");
        list5.add("two");
        String [] arr5 = list5.toArray(new String[0]);
        list5.add("three");
        System.out.println(list5);
        System.out.println(Arrays.toString(arr5));

    }

}
