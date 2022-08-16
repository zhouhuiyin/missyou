package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue接口 队列
 * Queue继承自Collection
 * 队列是经典的数据结构，可以保存一组元素，但是存取元素必须遵循先进先出原则。
 * 常用实现类：java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);
        String str = queue.poll();//出队列，queue中删除
        System.out.println(queue);
        str = queue.peek();//取到元素，但是不会删除
        System.out.println(str);
        System.out.println(queue);
        //遍历
        for(String s: queue){
            System.out.println(s);
        }
        System.out.println(queue);

        while (queue.size()>0){
            String e = queue.poll();
            System.out.println(e);
        }
        System.out.println(queue);

    }
}
