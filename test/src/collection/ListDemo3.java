package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 取子集
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        List<String> list1 = list.subList(0,3);//求子集 含头不含尾
//        System.out.println(list1);
        List<Integer> list3 = new ArrayList<>();
        for(int i=0;i<10;i++){
            list3.add(i);
        }
        List<Integer> list4 = list3.subList(1,5);//对子集进行操作的时候就是对元集合进行操作
        for(int i =0;i<list4.size();i++){
            int t = list4.get(i);
            list4.set(i,t*10);
        }
        System.out.println(list4);
        System.out.println(list3);

        //删除部分数据
        list3.subList(1,8).clear();
        System.out.println(list3);

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

    }
}
