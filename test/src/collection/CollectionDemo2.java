package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));

        System.out.println(c);
        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println("包含："+contains);

        c.remove(p);
    }
}
