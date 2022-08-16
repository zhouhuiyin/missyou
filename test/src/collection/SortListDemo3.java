package collection;

import java.util.*;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("tom");
//        list.add("jerry");
//        list.add("rose");
//        list.add("jack");
//        list.add("Ada");
//        list.add("bill");
//        list.add("allen");
//        list.add("james");
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        System.out.println(list);
//        Comparator c = new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
