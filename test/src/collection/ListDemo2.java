package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        System.out.println(list);
        list.add(2,"seven");
        System.out.println(list);
        String del = list.remove(2);
        System.out.println(del);

    }
}
