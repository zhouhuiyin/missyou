package collection;

import java.util.*;

/**
 *
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        String str = list.get(2);
        System.out.println(str);
//        for(String s : list){
//            System.out.println(s);
//        }
//        String s = list.set(2,"six");//返回被替换的字符串
        System.out.println(list);
        for(int i=0;i<list.size()/2;i++){
            String s = list.get(i);
            s = list.set(list.size()-1-i,s);
            list.set(i,s);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);



    }
}
