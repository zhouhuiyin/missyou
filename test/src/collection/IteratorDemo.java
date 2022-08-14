package collection;

import socket.Server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合提供了统一的遍历方式：迭代器模式
 * Iterator iterator()
 * 该方法可以获取一个用来遍历当前集合的迭代器，使用它对集合进行遍历。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        c.add("six");
        //获取迭代器
        Iterator it = c.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            if("#".equals(str)){
                //迭代器在遍历过程中要求不能通过集合的方法增删元素，否则会抛出异常
                //c.remove(str);
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);
    }
}
