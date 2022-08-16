package collection;

import java.util.*;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,4));
        list.add(new Point(9,5));
        list.add(new Point(7,5));
        list.add(new Point(1,2));
        System.out.println(list);
        /*
        compare 比较
        Comparable可比较
         */
//        Comparator c = new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        };
        /*
        Java 23种设计模式之一；回掉模式
        我们调用A类的B方法，传入一个参数C（c中有一个方法d），而b方法在执行的过程中会回调我们传入的C类重的D方法，这种象限
        称为回调模式
         */
      //  Collections.sort(list,c);
//        Collections.sort(list,new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        });
        Collections.sort(list,(o1,o2)->
                 o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                        o2.getX()*o2.getX()+o2.getY()*o2.getY()
        );
        System.out.println(list);
    }
}
